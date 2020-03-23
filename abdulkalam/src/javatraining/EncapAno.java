package javatraining;

public class EncapAno {

	public static void main(String[] args)
	{
		Security cs=new Security();
		cs.setEmpid(585);
		cs.setEmpchar('M');
		cs.setEmpName("Madhan");
		
		System.out.println(cs.getEmpchar());
		System.out.println(cs.getEmpid());
	}

}
class Security	
{
	private int empid;
	private String[] empName;
	private char empchar;
	
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public void setEmpName(String string) {
		// TODO Auto-generated method stub
		
	}
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpName(String[] String)
	{
		this.empName=String;
	}
	public String[] getEmpame()
	{
		return empName;
	}
	public void setEmpchar(char empchar)
	{
		this.empchar=empchar;
	}
	public char getEmpchar()
	{
		return empchar;
	}
	
	
	
}


























