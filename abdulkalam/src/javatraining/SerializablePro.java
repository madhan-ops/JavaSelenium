package javatraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializablePro {

	public static void main(String[] args) throws Exception
	{
		Serial s=new Serial();
		s.i=5;
		s.j=8;
		s.k=10;
		
		File f=new File("serialdoc.txt");
		FileOutputStream fos=new FileOutputStream(f);
		@SuppressWarnings("resource")
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		FileInputStream fis=new FileInputStream(f);
		@SuppressWarnings("resource")
		ObjectInputStream ois=new ObjectInputStream(fis);
		Serial s2=(Serial) ois.readObject();
		System.out.println("value of j is :"+s2.j);
		
		
	}

}

@SuppressWarnings("serial")
class Serial implements Serializable
{
	int i,j,k;
	public void show()
	{
		System.out.println("values are "+i+" "+j+" "+k);
	}
}