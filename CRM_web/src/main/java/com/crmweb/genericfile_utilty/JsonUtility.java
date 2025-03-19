package com.crmweb.genericfile_utilty;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtility {
	
//	public static void main(String[] args) throws Throwable {
	public String getDataFromJsonFile(String key) throws Throwable {
		
		String jPath = "./configAppData/appCommonData.json";
		FileReader fileR =new FileReader(jPath);
		
		JSONParser parser= new JSONParser();
//		Object obj = parser.parse(new FileReader(new File("C:\\Users\\Nithya\\OneDrive\\Desktop\\appCommonData.json")));
		
		Object obj = parser.parse(fileR);
		JSONObject map = (JSONObject)obj;
		
		String data= (String)map.get(key);
        // String data1= map.get(key).toString();      // Alternative use
		return data;
	}
}



