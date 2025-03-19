package com.crmweb.genericfile_utilty;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	public String getDataFromPopertyFile(String key) throws Throwable {
		
		String pPath = "./configAppData/commondata.Properties";
		FileInputStream Pfis = new FileInputStream(pPath);

		Properties pObj = new Properties();
		pObj.load(Pfis);
		String data= pObj.getProperty(key);
		
		return data;
	}
	

}
