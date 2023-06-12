import learn_recursion_II.string_replacement;

public class check_string_contain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // check the blank string contain of the any string or not 
		String str = "shivam";
		String stv = "";
		// now compair between two string present or 
		System.out.println(str.contains(stv));
		// mow learn the check the append of the string 
		// now creating the new string buffer
		String name = "shivam";
		StringBuffer sts = new StringBuffer(name);
		sts.append("def");
		// so hear we learn only string buffer are the use the append method and the setchar method
		// now the set the value at the index 
		sts.setCharAt(0, 'f');
		
		// now changed in the string buffer
		sts.setCharAt(1, 'g');
System.out.println(sts);


int j = 97 ;
char g = (char)j;
System.out.println(g);

 // if now i am creating the string and want to check the string address 
// String my_name = "shivam singh" ; 
// String your_name = "shivam singh" ; 
//if (my_name == your_name) {
//	System.out.println(true);
//}
//
//// check the address of the both of the string 
//System.out.print(your_name+my_name);
//System.out.println(my_name.hashCode());
//System.out.println(your_name.hashCode());
// creating the new string 
 String my_name = new String("shivam") ; 
System.out.println(my_name);


String myString1 = new String(" ");
System.out.println(myString1.equals(my_name));
String myString2 = new String("Sample2");
System.out.println(myString1.hashCode());

	}

}
