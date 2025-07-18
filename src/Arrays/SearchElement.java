package Arrays;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50};
		int search = 20;
		boolean status=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("element found");
				status=true;
			}
		}
		
		if(status==false)
		{
			System.out.println("element not found");
		}
	}

}
