import java.util.Scanner;

public class farenhight_to_celcious {
	 public static int celcous(int f){
			
		   int g = ((f-32)*5/9);
		   int c = (int)g;
		   
		   return c;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		int step = input.nextInt();
		
		
		
		
		 for (int i = start; i <=end; i+=step) {
			 System.out.println(i+"\t"+celcous(i)); 
		 }
		

	}

}
