package javatraining;

public class ToStringMethodEx
{

	public static void main(String[] args)
	{
		Student sc1=new Student(11,"Madhan");
		System.out.println(sc1);
	}

	
}



class Student
{
	String sname;
	int rollno;
	public Student(int rollno,String sname)
	{
		this.rollno=rollno;
		this.sname=sname;
	}
	


@Override
public String toString()
{
	return rollno +" "+ sname;
}
}