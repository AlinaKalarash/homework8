package GraphicEditor;

import java.util.Locale;

public class Shape {


    public void printInfo(String name) {
        System.out.println("The name of shape is: " + name);
        switch (name.toLowerCase(Locale.ROOT)) {
            case "quad":
                new Quad().printColor();
                break;
            case "circle":
                new Circle().printColor();
                break;
            case "triangle":
                new Triangle().printColor();
                break;
            case "rhombus":
                new Rhombus().printColor();
                break;
            case "rectangle":
                new Rectangle().printColor();
                break;
            default:
                System.out.println("Unknown");
        }


    }

}
