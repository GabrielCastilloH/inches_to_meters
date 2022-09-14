import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double inches;
        double meters;
        String inchesStr;

        System.out.println("Enter the number of inches: ");
        Scanner numberInput = new Scanner(System.in);
        inchesStr = numberInput.nextLine();

        inches = Double.parseDouble(inchesStr);

        meters = inches * 0.0254;

        System.out.println(Double.toString(inches) + " inches is " + meters + " meters.");
    }
}
