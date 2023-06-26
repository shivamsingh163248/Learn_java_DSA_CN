package learn_recursion_II;

import java.util.Scanner;

public class merge_short {

	

	    // creatign the printing array 
	public static void print(int[]arr){

	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i]+" ");
	}
	System.out.println();
	}

	// now creating the function for the sweping 
	public static void sweping(int[]shivm , int[]itisha , int[]arr){
	int i = 0 ; 
	int j = 0 ; 
	int k = 0 ; 

	while (shivm.length>i && itisha.length > j) {
	  // check the the at index o 
	  if (shivm[i] < itisha[j]) { // if you want to changed in reverse the sybol do un reverse >
	     arr[k] =shivm[i] ;
	     i++ ; 
	     k++ ; 
	  }else{

	      arr[k] = itisha[j] ; 
	      k++ ; 
	      j++ ; 
	  }
	}

	if (i<shivm.length) {
	    // copy all the value remain 
	    while (shivm.length>i){
	    arr[k] =shivm[i] ;
	    k++ ; 
	    i++ ;
	    }
	}

	if ( itisha.length > j) {
	    
	      while (itisha.length>j){
	    arr[k] =itisha[j] ;
	    k++ ; 
	    j++ ;
	    }
	}


	}

	    public static void mergeSort(int[] arr, int l, int r){
	        // Write your code here
	 //frist writeing the base case 
	        if (arr.length ==1) {
	            return  ; 
	        }
	        // creating  the array
	        int midvalue = (l+r)/2 ;  
	        int[]c = new int[midvalue ] ; 
	        int[]d = new int [arr.length - c.length ] ;
	        // now copying the deta from 
	        for (int i = 0; i < c.length; i++) {
	            c[i] = arr[i] ;  
	        }
	   
	         print(c);       


	        for (int i = midvalue; i < arr.length; i++) {
	            d[i - midvalue] = arr[i] ; 
	        }
	         print(d);
	        
	     mergeSort(c, 0, c.length);
	      mergeSort(d,0, d.length);
	      sweping(c, d, arr);

	 print(c);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    public static int[] takeInput() {
	        Scanner s = new Scanner(System.in); 
	        int size = s.nextInt();
	        int arr[] = new int[size];
	        for (int i = 0; i < size; i++) {
	            arr[i] = s.nextInt();
	        }
	        return arr;
	    }

	    public static void printArray(int input[]) {
	        for(int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + " ");
	        }
	    }

	    public static void main(String[] args) {
	        int[] input = takeInput();
	        mergeSort(input, 0, input.length - 1);
	        printArray(input);
	    }
	}


