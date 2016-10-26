package com.saber.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import sun.net.www.http.HttpClient;

public class ClientUtil {
	 public static void readContentFromGet(String url)throws IOException{
	        URL getUrl =new URL(url);
	        HttpURLConnection connection = (HttpURLConnection)getUrl.openConnection();
	        connection.connect();
	        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
	        System.out.println("=============================");
	        System.out.println("开始解析返回数据");
	        System.out.println("=============================");
	        String lines = reader.toString();
	        //TODO:
	        
	        reader.close();
	        connection.disconnect();
	        System.out.println("=============================");
	        System.out.println("返回数据解析完毕");
	        System.out.println("=============================");

	    }
}
