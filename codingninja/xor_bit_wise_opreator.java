
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
		            
		            
		            int a6=5;
		            a6+=5+(++a6)+(a6++);
		            System.out.print(a6);
		            
		            
		            
		            int a7=10,b7=20;
		            System.out.println(a7+++--b7);//line 1
		          //  System.out.println(a7--+++b7);//line 2
		            System.out.println(a7++-++b7);//line 3
		        //    System.out.println(a7+++++b7);//line 4
		            
		            int a8=10;
		            a8+=++a8-5/3+6*a8;
		            System.out.print(a8);
		            
		            for(int i=1;i<10;i*=2)
		            {
		                 System.out.println(i);
		            } 
		            
		            
		            for(int i=483;i>0;i=i%3)
		            {
		                System.out.print("*");
		            }
		            
//		            
//		            for(int i = 0; i < 3; i++) {
//		                System.out.print(i + " ");
//		                }
//		            System.out.print(i + " ");
//		            
//		            
//		            for(int i = 0; i < 5; i = i + 1){
//		                System.out.print(i + " ");
//		                i = i + 1;
//		            }
//		            for(int i = 1; i < 5; i = i + 1){
//		                System.out.print(i +" ");
//		                i = i - 1;
//		            }
		            
		            int i=0;
		            for(;;)
		            {
		                if(i==5)
		                    break;
		                System.out.print(i);
		                i++;
		            }
		            
//		            for(int j=7;j!=0;j--)
//		            {
//		                System.out.print(j--);
//		            }
//		
		            
		            
		            
		            

	}

}
