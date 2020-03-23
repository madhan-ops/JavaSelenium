package javatraining;


import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileCreation {

	public static void main(String[] args) throws Exception
	{
		Properties p=new Properties();
		
		OutputStream os=new FileOutputStream("dataconfig.properties");
		p.setProperty("url", "https://google.co.in");
		p.setProperty("uname", "madhan");
		p.setProperty("pass","venkatesa");
		p.store(os, null);

	}

}
