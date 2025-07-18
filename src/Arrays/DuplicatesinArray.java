package Arrays;

public class DuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {10,20,10,30,10,50,10,60};
		int num=10;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
				{
				count++;
				}
				}
		
		System.out.println(count);
		
	}

}
