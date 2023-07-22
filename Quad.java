package GraphicEditor;

import java.util.Scanner;

public class Quad extends Shape implements colorout, Square {
    public void printColor() {
        System.out.println("The color of shape is: " + Colors.RED);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Okay! Now write a length of quad's side: ");

        squareCal(scanner.nextInt());
        scanner.close();
    }

    public void squareCal(double a){
        System.out.println("The square is: " + a*a);
    }
}
