import java.util.Scanner;

public class taschenrechner3 {
    public static void main(String[] args) {
        String codewort = ("Enter");

        Scanner zahl1 = new Scanner(System.in);
        System.out.println("Enter your calculation");
        String value1 = String.valueOf(zahl1.nextLine());
        while(!value1.contains(codewort)) {
            //5 + 6 - 7 * 9 / 10
            String[] splitted = value1.split(" ");
            //[5][+][6][-][7][*][9][/][10]
            Float a = null;
            String b = null;
            Float sum = null;
            for (int i = 0; i < splitted.length; i++) {
                if (a == null && checkMe(splitted[i])) /*if a exists and is a valid integer*/ {
                    a = Float.valueOf(splitted[i]);
                } else if (b == null && !checkMe(splitted[i])) {
                    b = splitted[i];
                } else if (a != null && b != null) {
                    try {
                        sum = Float.valueOf(calc(Float.valueOf(a), Float.valueOf(splitted[i]), b));
                        a = sum;
                        b = null;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else {
                    System.out.println("smth went wrong");
                }

            }
            System.out.println(a);
            Float Ans = a;
            value1 = String.valueOf(zahl1.nextLine());
        }
    }

    public static boolean checkMe(String s) {
        boolean amIValid = false;
        try {
            Integer.parseInt(s);
            // s is a valid integer!
            amIValid = true;
        } catch (NumberFormatException e) {
            //sorry, not an integer
            // we just move on, but you could have code here
        }
        return amIValid;
    }

    public static String calc(Float value1, Float value2, String operator) {
        if (operator.contains("*"))  {
            return String.valueOf(value1 * value2);
        }
        else if (operator.contains("+")) {
            return String.valueOf(value1 + value2);
        }
        else if (operator.contains("-")) {
            return String.valueOf(value1 - value2);
        }
        else if (operator.contains("/")) {
            return String.valueOf(value1 / value2);
        }
        else if (operator.contains("%")) {
            return String.valueOf(value1 % value2);
        }
        else {
            return ("something went wrong");
        }
    }
}
