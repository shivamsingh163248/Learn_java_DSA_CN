import java.util.Scanner;

public class checknumberprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int n = input.nextInt();
// chackprime number or not
int k;
for (int i = 2; i < n; i++) {
	if (n%i == 0) {
		System.out.println("notprime");
		break;
	}else {
		System.out.println("prime");
		break;
	}
		  
	
}

	}

}
