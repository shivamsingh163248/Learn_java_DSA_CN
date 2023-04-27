
public class xor_bit_wise_opreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int a=10,b=-20;
		    System.out.println(a^b);
		    
		        int a1 = 42;
		        int b1 = ~a1; //(there is tilde sign before a)
		        System.out.println(a1 + " " + b1);      
		        
		        
		           
		            int x , y = 1;
		            x = 10;
		            if (x != 10 && x / 0 == 0)
		                System.out.println(y);
		            else
		                System.out.println(++y);
		       
		            int x2 = 15;
		            int y2 = x2++;
		            int  z2 = ++x2;
		            System.out.println(y2 +" " + z2);
		            
		            
		            
		            int x4 =10;
		            int y4 = 20;
		            if(x4++ > 10 && ++y4 > 20 ){
		            System.out.print("Inside if  ");
		            }else{
		            System.out.print("Inside else  ");
		            }
		            System.out.println(x4 +" "+y4);
		            
		            
		            int x5 = 10;
		            int y5 = 20;
		            if(x5++ > 10 || ++y5 > 20 ){
		           System.out.print("Inside if  ");
		            }else{
		           System.out.print("Inside else  ");
		            }
		            System.out.println(x5  + " " + y5);
		    
		

	}

}
