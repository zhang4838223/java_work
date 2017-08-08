package com.springBoot.test.comm.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.catalina.util.URLEncoder;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.impl.cookie.BestMatchSpecFactory;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.protocol.HTTP;

import javax.servlet.http.Cookie;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by anchu.zhang on 2016/10/26.
 */
public class HttpUtil {

    private static final String APPLICATION_JSON = "application/json";
    private static final Gson gson = new Gson();
    private static CookieStore cookieStore = null;
    static HttpClientContext context = null;

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

    /**
     * http  post请求
     * 对异常进行处理封装为response
     * @throws Exception
     */
    public static String postWithCookie(String url, String cookieStr, String jsonParam) {
        String result = "";
        if (StringUtils.isEmpty(url) && StringUtils.isEmpty(jsonParam)) {
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
            request.setHeader("content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            request.setHeader("Host", "ops.zhaogangren.com");
            request.setHeader("Accept-Encoding", "gzip, deflate");
            request.setHeader("Accept-Language", "zh-CN,zh;q=0.8");
            request.setHeader("Origin", "http://ops.zhaogangren.com");
            request.setHeader("Referer", "http://ops.zhaogangren.com/query/db/");
            request.setHeader("X-Requested-With", "XMLHttpRequest");
            request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36");
//            request.setHeader("Cookie", "gr_user_id=b91d60aa-b6aa-402f-9639-784cb9d46fd8; Hm_lvt_e960fd499933a058f59cb777c530d6ea=1501030812,1501117412,1501205773,1501635126; portalCookie=EgN_9fwUf1X11yRPZlWuR2Np0cebMW-gQSzeCRM5JnUd38u_xdeEyXSeiBi36Y8Y; zg_sso_token=M5orrHJCEQfmd9RB8B75WXHlkkOsq0QTEtCeOY6msdg0MK8_iO-OSC99GXIPyALMgf-fZiUk5GxM3dA5YL_N1A..; session=\"4oCt0Yu+Y7SEJ+Bo2a7VDNLjP54=?lat_name=Vlx1NWYyMFx1NjY1M1x1NTE5YgpwMAou&ops_token=UydlMmEyMGIyN2YzOTljNDkyNDJmNDdiN2MxY2M1M2UyM2JhZjFhM2UwJwpwMAou&token=Vk01b3JySEpDRVFmbWQ5UkI4Qjc1V1hIbGtrT3NxMFFURXRDZU9ZNm1zZGcwTUs4X2lPLU9TQzk5R1hJUHlBTE1nZi1mWmlVazVHeE0zZEE1WUxfTjFBLi4KcDAKLg==&username=VnhpYW9qdW4uemhhbmcxCnAwCi4=\"");

            HttpResponse response = closeableHttpClient.execute(request, context);

            int code = response.getStatusLine().getStatusCode();
            // 若状态值为200，则ok
            if (code == HttpStatus.SC_OK) {
                //从服务器获得输入流
                input = response.getEntity().getContent();
                isr = new InputStreamReader(input,  HTTP.UTF_8);
                buffer = new BufferedReader(isr, 10 * 1024);

                stringBuffer = new StringBuffer();
                while ((line = buffer.readLine()) != null) {
                    stringBuffer.append(line);
                }
                result = stringBuffer.toString();
            } else {
                //状态值不为200
                return response.toString();
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

    public static void setContext() {
        System.out.println("----setContext");
        context = HttpClientContext.create();
        Registry<CookieSpecProvider> registry = RegistryBuilder
                .<CookieSpecProvider> create()
                .register(CookieSpecs.BEST_MATCH, new BestMatchSpecFactory())
                .register(CookieSpecs.BROWSER_COMPATIBILITY,
                        new BrowserCompatSpecFactory()).build();
        context.setCookieSpecRegistry(registry);
        context.setCookieStore(cookieStore);
    }

    public static void setCookieStore(HttpResponse httpResponse) {
        System.out.println("----setCookieStore");
        cookieStore = new BasicCookieStore();
        // JSESSIONID
        String setCookie = httpResponse.getFirstHeader("Set-Cookie")
                .getValue();
        String JSESSIONID = setCookie.substring("JSESSIONID=".length(),
                setCookie.indexOf(";"));
        System.out.println("JSESSIONID:" + JSESSIONID);
        // 新建一个Cookie
        BasicClientCookie cookie = new BasicClientCookie("JSESSIONID",
                JSESSIONID);
        cookie.setVersion(0);
        cookie.setDomain("passport.zhaogangren.com");
        cookie.setAttribute("gr_user_id", "b91d60aa-b6aa-402f-9639-784cb9d46fd8");
        cookie.setAttribute("portalCookie", "EgN_9fwUf1X11yRPZlWuR2Np0cebMW-gQSzeCRM5JnUd38u_xdeEyXSeiBi36Y8Y");
        cookie.setAttribute("zg_sso_token", "M5orrHJCEQfmd9RB8B75WXHlkkOsq0QTEtCeOY6msdg0MK8_iO-OSC99GXIPyALMZCqKndhrm1VYQY4lmbCnyA..");
        cookie.setAttribute("Hm_lvt_e960fd499933a058f59cb777c530d6ea", "1501117412,1501205773,1501635126,1501809090");
        cookie.setAttribute("Hm_lpvt_e960fd499933a058f59cb777c530d6ea", "1501809109");
        cookie.setAttribute("session", "\"olCVde1uiFRc+Lb5qBtRQNah8IY=?lat_name=Vlx1NWYyMFx1NjY1M1x1NTE5YgpwMAou&ops_token=UyczZWM0NWUwNzAxOTY1NDQ5NTc3ZDlmOTcxYWE1YjExY2UwMzRlZWZmJwpwMAou&token=Vk01b3JySEpDRVFmbWQ5UkI4Qjc1V1hIbGtrT3NxMFFURXRDZU9ZNm1zZGcwTUs4X2lPLU9TQzk5R1hJUHlBTE1aQ3FLbmRocm0xVllRWTRsbWJDbnlBLi4KcDAKLg==&username=VnhpYW9qdW4uemhhbmcxCnAwCi4=\"");
        cookieStore.addCookie(cookie);
    }

    public static void login(){
        InputStream input = null;//输入流
        InputStreamReader isr = null;
        BufferedReader buffer = null;
        HttpPost request = null;
        try {
            HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
            //HttpClient
            CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
            /*post向服务器请求数据*/
            request = new HttpPost("http://passport.zhaogangren.com/login.action");
            //设置超时时间
            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(15000)
                    .build();
            request.setConfig(config);
            String jsonParam = "ssoRedirectUrl=http://www.zhaogangren.com/&" +
                    "systemAlias=platform.information.portal.ui&" +
                    "orgTitlePkid=10000&" +
                    "loginName=8QZJ11eGlhb2p1bi56aGFuZzE=&" +
                    "pwd=PEUB11WmhhbmcxMTExMTE=";
            @SuppressWarnings("deprecation")
            StringEntity se = new StringEntity(jsonParam, HTTP.UTF_8);
            request.setEntity(se);
            request.setHeader("content-Type", "application/x-www-form-urlencoded");
            request.setHeader("Host", "passport.zhaogangren.com");
            request.setHeader("Upgrade-Insecure-Requests", "1");
            request.setHeader("Accept-Encoding", "gzip, deflate");
            request.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
            request.setHeader("Cache-Control", "max-age=0");
            request.setHeader("Accept-Language", "zh-CN,zh;q=0.8");
            request.setHeader("Origin", "http://passport.zhaogangren.com");
            request.setHeader("Referer", "http://passport.zhaogangren.com/login?redirectUrl=http://ops.zhaogangren.com/workflow/apply_start/&zg_sso_system_alias=ops.portal.service.ui");
            request.setHeader("X-Requested-With", "XMLHttpRequest");
            request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36");
//            request.setHeader("Cookie", "gr_user_id=b91d60aa-b6aa-402f-9639-784cb9d46fd8; Hm_lvt_e960fd499933a058f59cb777c530d6ea=1501030812,1501117412,1501205773,1501635126; portalCookie=EgN_9fwUf1X11yRPZlWuR2Np0cebMW-gQSzeCRM5JnUd38u_xdeEyXSeiBi36Y8Y; zg_sso_token=M5orrHJCEQfmd9RB8B75WXHlkkOsq0QTEtCeOY6msdg0MK8_iO-OSC99GXIPyALMgf-fZiUk5GxM3dA5YL_N1A..; session=\"4oCt0Yu+Y7SEJ+Bo2a7VDNLjP54=?lat_name=Vlx1NWYyMFx1NjY1M1x1NTE5YgpwMAou&ops_token=UydlMmEyMGIyN2YzOTljNDkyNDJmNDdiN2MxY2M1M2UyM2JhZjFhM2UwJwpwMAou&token=Vk01b3JySEpDRVFmbWQ5UkI4Qjc1V1hIbGtrT3NxMFFURXRDZU9ZNm1zZGcwTUs4X2lPLU9TQzk5R1hJUHlBTE1nZi1mWmlVazVHeE0zZEE1WUxfTjFBLi4KcDAKLg==&username=VnhpYW9qdW4uemhhbmcxCnAwCi4=\"");

            HttpResponse response = closeableHttpClient.execute(request);
            setCookieStore(response);
            setContext();
            int code = response.getStatusLine().getStatusCode();
            // 若状态值为200，则ok
            if (code == HttpStatus.SC_OK) {
                //从服务器获得输入流
                System.out.println("==============================登录成功==============================");
            } else {
                //状态值不为200
                System.out.println("==============================登录失败==============================");
            }
        }catch (Exception e){
            e.printStackTrace();
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
        setContext();
    }
    public static void main(String[] args){
        login();
        String param = "connection_id=10&sql=SELECT+*+FROM+(++{0}+%0A)+A+WHERE+ROWNUM+%3C%3D+3001";
        String sqlStr = URLEncoder.DEFAULT.encode("select * from tbatch order by pkid desc");

        String sql = TextUtils.format(param, sqlStr);
        String result = postWithCookie("http://ops.zhaogangren.com/query/db/executeSql", null, sql);
        System.out.println(result);
    }

}
