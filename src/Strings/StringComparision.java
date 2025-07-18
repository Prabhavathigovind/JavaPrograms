package Strings;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3="prabha";
		String s4 = new String("prabha");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String s5 = new String ("divya");
		String s6 = new String("divya");
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		String s7 = "sai";
		String s8 = new String("sai");
		String s9=s8;
		System.out.println(s7==s8);
		System.out.println(s7.equals(s8));
		System.out.println(s8==s9);

	}

}
