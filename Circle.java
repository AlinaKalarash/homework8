package GraphicEditor;

import java.util.Scanner;

public class Circle extends Shape implements colorout, Square{
    public void printColor() {
        System.out.println("The color of shape is: " + Colors.BLUE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Okay! Now write a radius: ");

        squareCal(scanner.nextDouble());
        scanner.close();
    }

    public void squareCal(double r){
        System.out.println("The square is: " + r*r*3.14);
    }
}
