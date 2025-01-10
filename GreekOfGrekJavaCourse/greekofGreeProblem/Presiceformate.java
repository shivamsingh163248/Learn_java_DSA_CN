package greekofGreeProblem;


import java.text.DecimalFormat;
import java.util.ArrayList;

public class Presiceformate {

	static ArrayList<Float> divisionWithPrecision(float a , float b){
        // creating the arrays lsit 
         ArrayList<Float>value = new ArrayList<>() ;
         DecimalFormat ft = new DecimalFormat("#.##") ; 
         float ans = a/b  ;
          ft.format(ans) ; 
         value.add(ans) ;
         String v = ft.format(ans);
         float value1 = Float.valueOf(v) ; 
         value.add(value1) ; 
         
         return value ; 
         
    
         
//         double num = 123.4567;
//
//         // prints only numeric part of a floating number
//         DecimalFormat ft = new DecimalFormat("####");     
//         System.out.println("Without fraction part: num = "
//                            + ft.format(num));
//
//         // this will print it upto 2 decimal places
//         ft = new DecimalFormat("#.##");      
//         System.out.println("Formatted to Give precision: num = "
//                             + ft.format(num));
//
//         // automatically appends zero to the rightmost part
//         // of decimal instead of #,we use digit 0
//         ft = new DecimalFormat("#.000000");
//         System.out.println("appended zeroes to right: num = "
//                             + ft.format(num));
//
//         // automatically appends zero to the leftmost of
//         // decimal number instead of #,we use digit 0
//         ft = new DecimalFormat("00000.00");
//         System.out.println("formatting Numeric part : num = "
//                             + ft.format(num));
//
//         // formatting money in dollars
//         double income = 23456.789;      
//         ft = new DecimalFormat("$###,###.##");
//         System.out.println("your Formatted Dream Income : "
//                              + ft.format(income));
         
    }
	
	public static void main(String[] args) {
		
		// now calling the function to check the result 
		ArrayList<Float>value = new ArrayList<>() ; 
		// calling the function 
	value = divisionWithPrecision(5, 7) ; 
	
	// creating the loop 
	for (Float i : value) {
		System.out.println(i);
	}
		
	  

	}

}
