package tries.pelindrome.matching;

import java.util.ArrayList;
import java.util.Scanner;

public class pelidroneMatchingMainFuntion {
	
	// creating the array list return function 
	public static ArrayList<String> takeinput(){
		
		// creating the object of the array list 
		ArrayList<String>collectionWorld = new ArrayList<>();
		// creating the loop for the adding element 
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the size of n ");
		int size = input.nextInt();
		// now creating the loop 
		for (int i = 0; i < size; i++) {
			System.out.print(i+" ");
			String world = input.next();
		    collectionWorld.add(world);	
		}
		
		return collectionWorld ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
