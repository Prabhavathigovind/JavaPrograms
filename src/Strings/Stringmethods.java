package Strings;
import java.util.Arrays;


public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "welcome";
		String s2 = " to my home";
		String s3 = " my friend";
		System.out.println(s1 + s2 );
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

		System.out.println(s1.concat(s2));
		
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s2.trim());
		System.out.println(s2);
		System.out.println(s1.charAt(0));
	//	System.out.println(s3.contains("my"));
	//	System.out.println(s3.contains("me"));
		
		String a = "home";
		String b = "Home";
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println(a.equalsIgnoreCase(b)); // Ignores case sensitive 
		
		System.out.println(a.replace("h", "d"));
		System.out.println(a);
		System.out.println(b.replace("H", "l"));
		System.out.println(b);
		
		String n = "Selenium";
		System.out.println(n.replace("e", "a"));
		System.out.println(n);
		System.out.println(n.substring(1,4));
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
        String mail = "govindprabs@gmail.com";
        String m[]=mail.split("@");
        System.out.println(Arrays.toString(m));

		


	}

}
