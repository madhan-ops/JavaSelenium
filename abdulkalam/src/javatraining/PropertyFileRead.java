package javatraining;

import java.io.FileInputStream;
 //import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
//import java.io.OutputStream;
import java.util.Properties;

public class PropertyFileRead {

	public static void main(String[] args) throws Exception 
	{
		Properties pr=new Properties();
		
		FileOutputStream ous=new FileOutputStream("dataprop.properties");
		pr.setProperty("url","abdulkalam.com");
		pr.setProperty("uname","madhan mohan");
		pr.setProperty("pass","Winner");
		
		pr.store(ous, null);
		
		InputStream fis=new FileInputStream("dataprop.properties");
		pr.load(fis);
		System.out.println(pr.getProperty("url"));
		pr.list(System.out);
	}

}
