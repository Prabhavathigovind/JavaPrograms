package JavaPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String text = "hello Namasthey";
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\\\Users\\\\pc\\\\Desktop\\\\Readfile.txt"));
        writer.write(text);
        writer.close();
        
        
	}

}
