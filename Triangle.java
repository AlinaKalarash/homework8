package GraphicEditor;

import java.util.Scanner;

public class Triangle extends Shape implements colorout, Square{
        public void printColor() {
            System.out.println("The color of shape is: " + Colors.GREEN);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Okay! Now write a length of triangle's side: ");

            squareCal(scanner.nextDouble());
            scanner.close();

        }

        public void squareCal(double a){
            System.out.println("The square is: " + (a*a*1.7)/4);
        }
}