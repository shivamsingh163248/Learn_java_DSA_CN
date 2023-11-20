package inbuldPQ;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;



public class inbuld_PQ {
	
	
	public static void main(String[] args) {
		
		// NOW creating the inbuilt priority queue that using the peek function and poll function 
		//and the using much more function 
		PriorityQueue<Integer>shorting = new PriorityQueue<>();		
		// taling the input from the user in the form of the arry 
		Scanner input = new Scanner(System.in) ; 
		System.out.println("enter the size of the arry ");
		// now creating the for loop 
		int size = input.nextInt();
		int[]arr = new int[size] ; 
		// now creating the for loop 
		for (int i = 0; i < arr.length; i++) {
			System.out.print("enter: "+i);
			arr[i] = input.nextInt() ; 
			
		}
		
		// now adding this array in priority quque 
		// creating the loop 
		
		for (int i : arr) {
			shorting.add(i) ; 
		}
		
		// now printing the peek and poll of the element 
		System.out.println(shorting.peek());
		System.out.println(shorting.poll());
		System.out.println(shorting.peek());
				
		
	}

}
