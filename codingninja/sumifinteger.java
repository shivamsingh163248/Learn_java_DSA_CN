import java.util.Scanner;

public class sumifinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// now finding the size of the string 
		// int lenght = n.length();
		int even=0;
		int odd =0;
		while(n>0)
		{
			int lastDigit = n%10;
			if(lastDigit%2==0)
			{
				even += lastDigit;
			}
			else
			{
				odd += lastDigit;
			}

			n = n/10;
		}

	System.out.println(even+" "+odd);

	}

}
