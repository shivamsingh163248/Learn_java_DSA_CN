import java.util.Scanner;

public class simple_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = "shivam";
		System.out.println(i.charAt(0));
		char j = i.charAt(1);
		// so now [rinting the both charecter and test both are right or not 
		System.out.println(j);
//		String a ="abcd";
//		String b="abcda";
//		System.out.println(a.compareTo(b));
		String a="coding",b="ninjas";
		if(a.contains("ing"))
		{
		    a+=b;
		}
		else
		{
		    b+="ing";
		}
		System.out.print(b+a);
		
		System.out.println();
		
		
		String y="coding";
		for(int i1=2;i1<5;i1++)
		{
		    System.out.print(y.substring(i1-1,i1+2));
		}
		
		Scanner s=new Scanner(System.in); 
		String str1=s.next();
		String str2=s.nextLine();
		String str3=str2+str1;
		System.out.println(str3);

	}

}
