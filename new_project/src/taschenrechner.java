import java.util.Scanner;

public class taschenrechner {
    public static void main(String[] args) {
        String codewort = ("Enter");

        Scanner zahl1 = new Scanner(System.in);
        System.out.println("Enter Value 1");
        Float value1 = Float.valueOf(zahl1.nextLine());

        Scanner zahl2 = new Scanner(System.in);
        System.out.println("Enter Value 2");
        Float value2 = Float.valueOf(zahl2.nextLine());

        Scanner operation = new Scanner(System.in);
        System.out.println("Enter Mathematical Operation");
        String operator = operation.nextLine();

        String ergebnis = calc(value1, value2, operator);
        System.out.println(ergebnis);
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
