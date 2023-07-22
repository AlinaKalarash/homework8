package GraphicEditor;

import java.util.Scanner;

public class Rhombus extends Shape implements colorout, DSquare{
    public void printColor() {
        System.out.println("The color of shape is: " + Colors.ORANGE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Okay! Now write d1 and d2: ");

        squareCal(scanner.nextDouble(), scanner.nextDouble());
        scanner.close();

    }

    public void squareCal(double a, double b){
        System.out.println("The square is: " + (a*b)/2);
    }
}
