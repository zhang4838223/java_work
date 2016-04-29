package com.zxj.esearch;

import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.FuzzyQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaojun.zhang on 2016/4/29.
 */
public class ElasticSerchApi {

    private static TransportClient.Builder builder = new TransportClient.Builder();
    private static TransportClient client = builder.build();

    public ElasticSerchApi() throws UnknownHostException {
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));
    }
    public static void main(String[] args) throws UnknownHostException {
        ElasticSerchApi api = new ElasticSerchApi();
        List<String> jsonUsers = api.getJsonUsers();
        String index = "indexdemo1";
        String type = "typedemo1";

//        api.generateIndex(index,jsonUsers,type);
        FuzzyQueryBuilder fuzzyQueryBuilder = QueryBuilders.fuzzyQuery("name", "lis");
        List<User> result = api.search(fuzzyQueryBuilder, index, type);
        System.out.println(result);
    }

    public IndexResponse generateIndex(String index, String jsonData, String type){
        IndexResponse indexResponse = client.prepareIndex(index, type).setSource(jsonData).execute().actionGet();
        return  indexResponse;
    }

    public void generateIndex(String index, List<String> jsonData, String type){
        IndexRequestBuilder indexBuilder = client.prepareIndex(index, type).setRefresh(true);
        for (String data: jsonData) {
            indexBuilder.setSource(data).execute().actionGet();
        }
    }

    public List<User> search(QueryBuilder queryBuilder, String index, String type){
        List<User> result = new ArrayList<User>();

        SearchResponse searchResponse = client.prepareSearch(index).setTypes(type)
                .setQuery(queryBuilder).execute().actionGet();
        SearchHits hits = searchResponse.getHits();
        System.out.println("查询结果数量：" + hits.getTotalHits());
        SearchHit[] searchHits = hits.getHits();
        for (SearchHit hit: searchHits){
            Integer age = (Integer)hit.getSource().get("age");
            String name = (String)hit.getSource().get("name");
            String address = (String)hit.getSource().get("address");
            result.add(new User(name, age, address));
        }

        return result;
    }
    public void close(){
        client.close();
    }

    public String user2Json(User user){
        String jsonData = null;
        try {
            XContentBuilder jsonBuilder = XContentFactory.jsonBuilder();
            jsonBuilder.startObject().field("name",user.getName())
                    .field("age",user.getAge())
                    .field("address",user.getAddress()).endObject();
            jsonData = jsonBuilder.string();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonData;
    }

    public List<String> getJsonUsers(){
        List<String> list = new ArrayList<String>();
        list.add(user2Json(new User("lisi",12,"shanghai")));
        list.add(user2Json(new User("王五",22,"上海")));
        list.add(user2Json(new User("王五1",22,"广州")));
        list.add(user2Json(new User("赵六",33,"上海")));
        return  list;
    }
}
