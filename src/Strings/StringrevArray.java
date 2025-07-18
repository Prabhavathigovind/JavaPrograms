package Strings;

import java.util.Scanner;

public class StringrevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string to be reversed");
		String s = sc.next();
		char a[]=s.toCharArray();
		String rev = "";
		
		for (int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
System.out.println("reversed string is "+ rev);
	}

}
