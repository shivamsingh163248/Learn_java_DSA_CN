package learnspacecomplexicity;

import java.util.Scanner;

public class quickshort {
	
	// meke the function of the partition 
	public static int swepingQuickShort(int[]arr , int startingIndex , int LastIndex) {
		// IF IAM TAKING THE POIET ELEMENT AT THE FRIST INEDEX 
		int poivetElement = arr[startingIndex] ; 
		// now find the point element at the right place 
		int countelement =  0 ; 
		// using the for loop for loop solving the problem 
		for (int i = startingIndex+1; i <= LastIndex; i++) {
			if (poivetElement > arr[i]) {
				// then the count the value 
				countelement++ ; 
			}
		}
		
		// now switching the point element at the right positing 
		int temp = arr[ startingIndex +  countelement] ; 
		arr[ startingIndex +  countelement] = poivetElement ; 
		arr[startingIndex] = temp ; 
		
		// now again sweeping the element using the while loop 
		int  i = startingIndex ; 
		int j = LastIndex ; 
		// using while loop sweeping are formed 
		while (i<j) {
			if (arr[i]< poivetElement) {
				i++ ; 
			}else if (arr[j]> poivetElement) {
				j-- ; 
			}else {
				// now sweeping  is the perform 
				temp = arr[i] ; 
				arr[i] = arr[j] ; 
				arr[j] = temp ; 
				i++ ; 
				j-- ; 
			}
		}
		
		// now return the element the 
		return startingIndex+countelement ; 
		
	}
	
	// mow make the quick short the function 
	public static void quickshorts(int[]arr , int startIngindex , int lastIndex) {
		// now write the base condition if this code
		
		if (startIngindex >= lastIndex) {
			return  ; 
		}
		
	// find the partition index and call the function 
		int pointindex = swepingQuickShort(arr, startIngindex, lastIndex);
		// now function call 
		quickshorts(arr, startIngindex, pointindex-1);
		quickshorts(arr, pointindex+1, lastIndex);
		
	//	System.out.println(arr.length+" (*");
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 	int[]arr = {31 ,56 ,20, 18, 27,3 ,4 ,8,10 , 30 , 40 } ;
		  Scanner s = new Scanner(System.in);
		        int size = s.nextInt(); 
		        int[] input = new int[size];
		        
		        for(int i = 0; i < size; i++){
		            input[i] = s.nextInt();
		        }
		     
		    
		
		// find the array length 
		int length = input.length ; 
		quickshorts(input, 0, length-1);
		
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
			
		}

		
		
		

	}

}
