package javaexample77stringasmathequation;

import java.util.Scanner;

public class StringTokenizerMathHelper {

    public static int Result(String equation) {
        try{
            return Resulting(equation);
        }
        catch(Exception e)
        {
            throw new IllegalArgumentException();
        }
    }
    
    private static int Resulting(String equation)
            throws IllegalArgumentException {
        try {
            Scanner tokenizer = new Scanner(equation);

            int number = tokenizer.nextInt();
            int res = number;
            String operation;

            while (tokenizer.hasNext()) {
                operation = tokenizer.next();
                number = tokenizer.nextInt();
                res = MathOperation(res, number, operation);
            }// end while
            return res;
        }// end try
        catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    private static int MathOperation(int num1, int num2, String operation)
            throws IllegalArgumentException {
        if (operation.equals("+")) {
            return num1 + num2;
        } else if (operation.equals("-")) {
            return num1 - num2;
        } else {
            throw new IllegalArgumentException();
        }
    }

}
