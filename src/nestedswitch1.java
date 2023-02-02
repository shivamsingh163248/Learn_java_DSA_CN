import java.util.Scanner;

public class nestedswitch1 {

	private static final String CSE = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now we write the program of the subject of the college using the the switch
		// program
		// take the value of the user from the user from the use of the scanner function
		Scanner input = new Scanner(System.in);
		// now the taking the value of the user
		System.out.println("enter the year");
		int a = input.nextInt();
		System.out.println("enter your branch  ex = CSE , ME , IT , EE , EC");
		String b = input.next();
		// now we are the using the scanner function
		switch (a) {
		case 1: {
			switch (b) {
			case "CSE": {
				System.out.println("your subject is the ");
				System.out.println("chemestry , phyices ,  pps");
				break;
			}
			case "EE": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "ME": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "IT": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "EC": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			default:
				System.out.println("Unexpected value: " + b);
			}
			break;
		}

		case 2: {
			switch (b) {
			case "CSE": {
				System.out.println("your subject is the ");
				System.out.println("chemestry , phyices ,  pps");
				break;
			}
			case "EE": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "ME": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "IT": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "EC": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			default:
				System.out.println("Unexpected value: " + b);
			}
			break;
		}

		case 3: {
			switch (b) {
			case "CSE": {
				System.out.println("your subject is the ");
				System.out.println("chemestry , phyices ,  pps");
				break;
			}
			case "EE": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "ME": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "IT": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "EC": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			default:
				System.out.println("Unexpected value: " + b);
			}
  break ;
		}
		case 4: {
			switch (b) {
			case "CSE": {
				System.out.println("your subject is the ");
				System.out.println("chemestry , phyices ,  pps");
				break;
			}
			case "EE": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "ME": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "IT": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			case "EC": {
				System.out.println("your subjet is the for theses branch");
				System.out.println("chemestry , physics , electronics");
				break;
			}
			default:
				System.out.println("Unexpected value: " + b);
			}
        break;
		}

		default:
			System.out.println("Unexpected value: " + a);
		}
	}

}
