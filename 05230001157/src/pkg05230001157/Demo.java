package pkg05230001157;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;

public class Demo {
    private double width;
    private double height;
    private double radius;
    private int rectangleNumber = 1;
    private int circleNumber = 1;

    public static void main(String[] args) {
        Demo demo = new Demo();
        
        try {
            Scanner scanner = new Scanner(new File("inputQuiz1.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String shape = line.substring(0, line.indexOf(","));
                
                System.out.println("The shape is: " + shape);

                if (shape.equalsIgnoreCase("rectangle")) {
                    demo.width = Double.parseDouble(line.substring(line.indexOf(",") + 1, line.lastIndexOf(",")));
                    demo.height = Double.parseDouble(line.substring(line.lastIndexOf(",") + 1));
                    
                    Rectangle rectangle = new Rectangle(demo.width, demo.height, demo.rectangleNumber);
                    
                    demo.rectangleNumber += 1;

                } else if (shape.equalsIgnoreCase("circle")) {
                    demo.radius = Double.parseDouble(line.substring(line.indexOf(",") + 1));
                    
                    Circle circle = new Circle(demo.radius, demo.circleNumber);
                    
                    demo.circleNumber += 1;
                }
                
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        
        Rectangle defaultRectangle = new Rectangle();
        defaultRectangle.setWidth(15);
        defaultRectangle.setHeight(10);
        System.out.printf("Width of the %d.", demo.rectangleNumber);
        System.out.printf("rectangle is %.2f", defaultRectangle.getWidth());
        System.out.printf(" and the height of the rectangle is %.2f", defaultRectangle.getHeight());
        System.out.println("");
        System.out.printf("Area of the %d.", demo.rectangleNumber);
        System.out.printf("rectangle is %.2f", defaultRectangle.getArea());
        System.out.printf(" and the perimeter of the rectangle is %.2f", defaultRectangle.getPerimeter());
        System.out.println("");
        
        Rectangle copyRectangle = new Rectangle(defaultRectangle);
        
        defaultRectangle.equals(copyRectangle);
        
        
        
        
    }
}