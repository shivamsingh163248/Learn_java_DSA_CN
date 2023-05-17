
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
		
		// now changed in the string buffer
		sts.setCharAt(1, ' ');
System.out.println(sts);


int j = 97 ;
char g = (char)j;
System.out.println(g);
	}

}
