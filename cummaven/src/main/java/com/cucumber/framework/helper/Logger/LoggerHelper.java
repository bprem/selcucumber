package com.cucumber.framework.helper.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.log4testng.Logger;

import com.cucumber.framework.utility.ResourceHelper;

public class LoggerHelper {
	
	public static boolean root=false;
	
	public static Logger getLogger(Class clas)
	{
		if(root)
		{
			return Logger.getLogger(clas);
		}
		PropertyConfigurator.configure(ResourceHelper.getResourcePath("/src/main/resources/configfile/log4j.properties"));
		root = true;
		return Logger.getLogger(clas);
	}

}