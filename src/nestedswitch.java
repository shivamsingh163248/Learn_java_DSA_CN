
public class nestedswitch {

	public static void main(String[] args) {
		
		int n =10;
		int a = 0;
		int b = 2;
		int j = a;	
			 
		 for(int i=0;i<=n-1;i++){
			
	            int s = b<<i;
	            j+=s;
	           
	          System.out.println(j);
			 
	        }
	}

}
