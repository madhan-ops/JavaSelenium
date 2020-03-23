package javatraining;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("demo.txt");
		FileOutputStream fos=new FileOutputStream(f);
		@SuppressWarnings("resource")
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("Madhan is a Winner");
		
		
		FileInputStream fis=new FileInputStream(f);
		@SuppressWarnings("resource")
		DataInputStream dis=new DataInputStream(fis);
		String str=dis.readUTF();
		
		System.out.println(str);

	}

}
