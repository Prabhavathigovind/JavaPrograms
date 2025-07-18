package OOPS;

public class Contsructors
{
	int x,y;
	
	public Contsructors()
	{
		 x=100;
		 y=200;
	}
	
	/*
	 * public Contsructors(int a. int b) { x=a; y=b; }
	 */
	
	void sum()
	
	
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contsructors obj = new Contsructors();
		obj.sum();

	}

}
