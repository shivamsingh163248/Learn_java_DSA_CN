package BasricDataTypeVariable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInputBuffer {
	
	
	// creating  the function for the taking the input in the buffer 
	public static void printUsingBufferReader() throws IOException {
		
		// creating the instace of the buffer 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		
		// agin creating the new object 
		System.out.println("enter the number ");
		String n  = br.readLine() ; 
	}

	public static void main(String[] args) {
		

	}

}
