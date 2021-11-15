package javaexample77stringasmathequation;

public class StringMathHelper {

    public static int Result(String str)
            throws IllegalArgumentException {
        try {
            String[] eq = String2StringArray(str);

            int index = 0;
            int res, second;
            res = Integer.parseInt(eq[index]);
            index++;
            String op;
            while (index < eq.length) {

                op = eq[index];
                index++;
                second = Integer.parseInt(eq[index]);
                res = Operation(res, second, op);
                index++;

            }// end while
            return res;
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    private static int Operation(int num1, int num2, String operation)
            throws IllegalArgumentException {
        if (operation.equals("+")) {
            return num1 + num2;
        } else if (operation.equals("-")) {
            return num1 - num2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static String[] String2StringArray(String str) {
        String[] arr = str.split(" ");
        return arr;
    }
}
