import GraphicEditor.Colors;
import GraphicEditor.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of shape: ");
        Shape shape = new Shape();
        String s = scanner.nextLine();
        shape.printInfo(s);
        
        scanner.close();
    }
}