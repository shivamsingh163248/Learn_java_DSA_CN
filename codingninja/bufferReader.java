import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReader {
	
	public static void main(String[] args) {
		
		// creating the learning and buffer reader 
	    InputStreamReader input = new InputStreamReader(System.in) ; 
	    // creating the input 
	   BufferedReader check = new BufferedReader(input) ; 
	   
	   // we are the using the read the data from the console 
	   try {
		String name  = check.readLine() ;
		System.out.println(name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	   
	   
	}

}
