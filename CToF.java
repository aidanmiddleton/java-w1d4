  import java.util.Scanner;


  public class CToF {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE PROVIDE A TEMP IN Celcius: ");

        double celcius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celcius + 32;

        System.out.println(fahrenheit + "F");

        
    }


  }