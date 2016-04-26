package com.automation.configuraion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;



public class Config {

	//instantiate the properties file
	// Load the complete file to system.set properties
	// Write a get method which gives the values from system.get properties

	Properties properties = new Properties();

	public Config() {
		loadFrameworkProperties();
		set();
	}
	// Load the properties file
	public void loadFrameworkProperties(){
		try {
			properties.load(new FileReader("H:\\Work\\systemtesting\\Config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*set all the properties to system path
	 * @returns - voida
	 */
	public void set(){
		Set<Object> keys = properties.keySet();
		for(Object key : keys){
			System.out.println("Setting the system "+key +"--"+properties.get(key).toString());
			System.setProperty(key.toString(), properties.get(key).toString());
		}
	}

	public static String get(String key){
		return System.getProperty(key);
	}
}
