
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class test12 {
	
	
	public static void print(int n) {
		int i,j;
		for(i=-n/2;i<=n/2;i++){
			
			
		    for(j=-n/2;j<=n/2; j++){
		
		    	if(Math.abs(i)+Math.abs(j)<n/2)
		         System.out.print(" ");
		       else
		        System.out.print("x");
	     	}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s = new Scanner(System.in);
//		int basic = s.nextInt();
//		char grade = s.next().charAt(0);
//		double hra = 0.2 * basic;
//		double da = 0.5 * basic;
//		int allowance;
//		if(grade == 'A') {
//		allowance = 1700;
//		}
//		else if(grade == 'B') {
//		allowance = 1500;
//		}
//		else {
//		allowance = 1300;
//		}
//		double pf =  (0.11 * basic);
//		double totalSalary = basic + hra + da + allowance - pf;
//		System.out.println(totalSalary);
//		

		
		
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        Collections.sort(l, Collections.reverseOrder());
        int a = 0;
        int s = 0;
        for (int i = 0; i < l.size(); i++) {
            if (i % 3 == 2) {
                a += l.get(i);
            }
            s += l.get(i);
        }
        scanner.close();
	}

}
