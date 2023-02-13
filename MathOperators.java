
import java.util.Scanner;

/**
* A simple calculator project.
*
* @author  Keiden B
* @version 1.0
* @since   2023-02-09
*/

public final class MathOperators {
    /**
    * Neccessary to prevent HideUtilityClass Error.
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Main lines of code.
    *
    * @param args a placeholder value when making the main function
    */
    public static void main(String[] args) {
        final Scanner get = new Scanner(System.in);
        float usrFinal = 0.0f;

        System.out.println("What would you like to do?");
        final String operator = get.nextLine();
        System.out.println("With what numbers?");
        final String usrNum1 = get.nextLine();
        final String usrNum2 = get.nextLine();
        get.close();

        if (operator.toUpperCase().equals("ADD")) {
            usrFinal = Float.parseFloat(usrNum1)
                + Float.parseFloat(usrNum2);

        } else if (operator.toUpperCase().equals("SUBTRACT")) {
            usrFinal = Float.parseFloat(usrNum1)
                - Float.parseFloat(usrNum2);

        } else if (operator.toUpperCase().equals("MULTIPLY")) {
            usrFinal = Float.parseFloat(usrNum1)
                * Float.parseFloat(usrNum2);

        } else if (operator.toUpperCase().equals("DIVIDE")) {
            usrFinal = Float.parseFloat(usrNum1)
                / Float.parseFloat(usrNum2);
        }
        System.out.printf("The result is %f.%n", usrFinal);
    }
}
