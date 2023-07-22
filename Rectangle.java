package GraphicEditor;

import java.util.Scanner;

public class Rectangle extends Shape implements colorout,DSquare{

    public void printColor() {
        System.out.println("The color of shape is: " + Colors.WHITE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Okay! Now write side1 and side2: ");

        squareCal(scanner.nextDouble(), scanner.nextDouble());
        scanner.close();

    }

    public void squareCal(double a, double b) {
        System.out.println("The square is: " + a*b);
    }
}
