import java.util.Scanner;

public class CalculateTip {


    public static void main (String[] args) {
        // initializing scanner
        Scanner input = new Scanner(System.in);
        //asking for input from the user
        System.out.print("Please provide your subtotal");
        // saving user input for subtotal
        double subTotal = input.nextDouble();

        System.out.println("Please provide Gratuity rate");

        int gratuity = input.nextInt();

        double gratuityDecimal = gratuity * 0.01;

        double total = subTotal + (subTotal * gratuityDecimal);

        System.out.println("the total is " + total);

    }


}