package JavaPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader file = new FileReader("C:\\Users\\pc\\Desktop\\Readfile.txt");
		
		BufferedReader buff = new BufferedReader(file);
		
		String textfile = null;
		
		while((textfile=buff.readLine())!=null)
		{
			System.out.println(textfile);
		}
		
		file.close();
		buff.close();

	}

}
