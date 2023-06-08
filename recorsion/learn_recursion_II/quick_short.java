package learn_recursion_II;

public class quick_short {

	public static int  partition(int[]arr , int si  , int ei ){
		// find the poit element 
		int poitelement  = arr[si] ; 
		int count_number = 0 ;
		// now creaing the for loop for the  searching the position number
		for (int i = si+1; i <= ei; i++) {
			if (poitelement > arr[i]) {
				count_number ++ ; 
			}
		}

		// now repacing the poit element form 
		int tenp = arr[si + count_number] ;
		arr[si+count_number] = poitelement ; 
		arr[si] = tenp ; 



    // now taking two ponter for the sweping eachother 
  int j = si ; 
  int k = ei ; 

  // now creating the while loop 
  while (j<k) {
	  // now creating the condation 
	  if (arr[j]<poitelement) {
		  j++ ; 
	  }else if (arr[k]>=poitelement) {
		  k-- ; 
	  }else {
      
	  // hear sweping the both element  
	   tenp = arr[j] ;
	   arr[j] = arr[k] ;
	   arr[k] = tenp ;
	   k-- ;
	   j++ ;


	  }
  }


  return si+count_number ;

	}
	
	public static void quickSort(int[] input ,int startingindex , int endindex ) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 // frist creating the base case 
		 if (startingindex >= endindex) {
			 return  ; 
		 }


		 // callling the partition function 
      int poitindex = partition(input, startingindex, endindex) ; 
	  quickSort(input, startingindex, poitindex-1);
	  quickSort(input, poitindex+1, endindex);
	  
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
