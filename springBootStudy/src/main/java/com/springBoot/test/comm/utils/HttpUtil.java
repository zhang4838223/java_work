package com.springBoot.test.comm.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by anchu.zhang on 2016/10/26.
 */
public class HttpUtil {

    private static final String APPLICATION_JSON = "application/json";
    private static final Gson gson = new Gson();


    /**
     * http  post请求
     * 对异常进行处理封装为response
     * @throws Exception
     */
    public static String httpPostByCatchException(String url, String jsonParam, String contractInfo) {
        String result = "";
        if (StringUtils.isEmpty(url) && StringUtils.isEmpty(contractInfo)) {
            return result;
        }
        InputStream input = null;//输入流
        InputStreamReader isr = null;
        BufferedReader buffer = null;
        StringBuffer stringBuffer = null;
        String line = null;
        HttpPost request = null;
        try {
            HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
            //HttpClient
            CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
            /*post向服务器请求数据*/
            request = new HttpPost(url);
            //设置超时时间
            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(15000)
                    .build();
            request.setConfig(config);
            @SuppressWarnings("deprecation")
            StringEntity se = new StringEntity(jsonParam, HTTP.UTF_8);
            request.setEntity(se);
            request.setHeader("ContractInfo", contractInfo);
            request.setHeader("content-Type", APPLICATION_JSON);

            HttpResponse response = closeableHttpClient.execute(request);
            int code = response.getStatusLine().getStatusCode();
            // 若状态值为200，则ok
            if (code == HttpStatus.SC_OK) {
                //从服务器获得输入流
                input = response.getEntity().getContent();
                isr = new InputStreamReader(input, "UTF-8");
                buffer = new BufferedReader(isr, 10 * 1024);

                stringBuffer = new StringBuffer();
                while ((line = buffer.readLine()) != null) {
                    stringBuffer.append(line);
                }
                result = stringBuffer.toString();
            } else {
                //状态值不为200
                return gson.toJson(response);
            }
        }catch (Exception e){
            e.printStackTrace();
            return e.toString();
        }finally {
            try {
                if (buffer != null) {
                    buffer.close();
                    buffer = null;
                }
                if (isr != null) {
                    isr.close();
                    isr = null;
                }
                if (input != null) {
                    input.close();
                    input = null;
                }
            } catch (Exception e) {
            }
        }
        return result;
    }


}
