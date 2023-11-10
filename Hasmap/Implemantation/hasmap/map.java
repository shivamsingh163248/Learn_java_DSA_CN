package Implemantation.hasmap;

import java.util.ArrayList;

public class map<T ,V>{
	
  // creating the arry list for the taking the arry 
	// now creating the arry list 
	ArrayList<mapnode<T, V> >bucket ; 
	// creating the count 
	 int count ; 
	 int numbacket ; 
	 
	 // now creating the constrocter 
	 public map() {
		// creating the new 
		bucket = new ArrayList<>() ; 
		// now creating the the size of the bucket 
		numbacket = 20 ; 
		// creating the for loop inisalization of the all is the null 
		for (int i = 0; i < numbacket; i++) {
			// now inisilation the null all the bucket 
			bucket.add(null) ; 
		}
	}
	 
	 
	 //  creating the insert function 
	 public  void insret(T key  , V value) {
		 
		 // fist getting the bucket index 
		 int bucketIndex = getbucketIndex(key) ;
		 
		 
	 }


	private int getbucketIndex(T key) {
		
		return 0;
	}
	 
}
