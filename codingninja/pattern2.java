import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
	     
        int i = 0;
        while(i < n ){
            int j = 0;
            while (j<n) {
                System.out.print("#");
                j++;
            }
            System.out.println(" ");
            i++;
        }

	}

}
