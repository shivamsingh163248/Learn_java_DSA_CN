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
		 // after the finding the index check it is or null or not 
		 // finding the head node in the bucket 
		 mapnode<T, V>head = bucket.get(bucketIndex) ; 
		 // now creating the loop if the not null head then update the value in the hasnode 
		 while (head != null) {
			// now finding the proper key for the update the value 
			 if (key.equals(head.key)) {
				// now updating the value 
				 head.value = value ;
				 
				 // after the update new we are the return 
				 
				 return  ;
			}
			 // for the continue loop we are the using the head next in the next loop 
			 head = head.next ; 
		}
		 
		 
		 
		 head = bucket.get(bucketIndex) ; 
		 // if the value is null then updating the vlaue 
		 
		 mapnode<T, V>newNode = new mapnode<>(key, value) ; 
		 newNode.next = head ; 
		 // for the making the heading using the bucket set value 
		 bucket.set(bucketIndex, newNode);
		 // now count for the finding the number of element in the link list 
		 count++ ; 
		 
		 
	 }


	private int getbucketIndex(T key) {
		
		// key are changing to hasmap and then creating the module for the return 
		int index = key.hashCode(); 
		int finalIndex = index%numbacket ; 
		return finalIndex ; 
		
		
	
	}
	 
}
