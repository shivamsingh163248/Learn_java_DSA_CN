 package shivam;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car shi = new car();
		// now call the function from the next folder
		shi.setspeeed(20);
		shi.getspeed();
		System.out.println(shi.getspeed());
		
		// call the value and the set and the check its working or not 
		
		shi.setdoor("black");
		// now printing the door value which are the used to the make another object 
		System.out.println(shi.getdoor());
		
		// again the set the value of the engin that are the used in the in the form of the object 
		shi.setengin("2hm");
		// printing value of the engin 
		System.out.println(shi.getengin());
	}

}
