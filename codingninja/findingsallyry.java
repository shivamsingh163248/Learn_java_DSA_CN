import java.util.Scanner;

public class findingsallyry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write your code here
		Scanner input = new Scanner(System.in);
		int basic = input.nextInt();
		char grade = input.next().charAt(0);
		// now calculate the total sallary
		double hra = (basic*0.2);
		double da = (basic*0.5);
		double pf = basic*0.11;
		// now writing the condation of allow and cacluate the value 
		int allow = 0;
		if (grade == 'A') {
			allow = 1700;
		} else if(grade == 'B'){
			allow = 1500 ;
		}else{
			allow = 1300;
		}
		// now we are the calculating the value 
		double total_sallary = (basic+hra+da+allow)-pf;
		System.out.println(Math.round(total_sallary));
				
				
	}

}
