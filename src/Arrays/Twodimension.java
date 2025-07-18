package Arrays;

public class Twodimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		int b[][] = {{1,2},{3,4},{5,6}};	
		
		System.out.println("length of rows " + a.length);
		System.out.println("length of columns " + a[0].length);
		
		for(int x=0;x<=2;x++)
		{
			for(int y=0;y<=1;y++)
			{
				System.out.print(b[x][y]+ "  ");
			}
			
			System.out.println();
			
		}
		
				
	
	for(int x[]:b)
	{
		for(int y:x)
		{
			System.out.print(y+" ");
		}
		System.out.println();
	}

}
}
