
package javaexample77stringasmathequation;

import java.util.Scanner;


public class JavaExample77StringAsMathEquation {

    
    public static void main(String[] args) {
        
        
        Scanner in=new Scanner(System.in);
        String equation=" ";
        int res=0;
        
        while(true){
            try{
            System.out.println("Enter your equation or press q to exit.....");
            equation=in.nextLine();
            
            if(equation.equals("q") || equation.equals("Q"))
                break;
            
            res=StringMathHelper.Result(equation);
            System.out.println("Result is: "+res);
            }
            catch(Exception e)
            {
                System.out.println("Not valid equation....");
            }
        }// end first while-loop
        
        System.out.println();
        System.out.println();
        
        while(true){
            try{
            System.out.println("Enter your equation or press q to exit.....");
            equation=in.nextLine();
            
            if(equation.equals("q") || equation.equals("Q"))
                break;
            
            res=StringTokenizerMathHelper.Result(equation);
            System.out.println("Result is: "+res);
            }
            catch(Exception e)
            {
                System.out.println("Not valid equation....");
            }
        }// end first while-loop
        
        
        
    }
    
}
