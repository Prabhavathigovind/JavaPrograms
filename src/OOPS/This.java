package OOPS;

public class This {
	
	int x ;
	int y;
	
	This(int a, int b)
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		This obj = new This(10,10);
		obj.display();

	}

}
