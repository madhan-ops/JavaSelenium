//Encapsulation or DataHiding or Data Binding
// Hiding the data members (variables or methods) from outside of the class 

package javatraining;

public class Encapsulation {

	public static void main(String[] args) 
	{
		Encap cap=new Encap();
		cap.setI(5);
		System.out.println(cap.getI());
	}

}

class Encap
{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	
}