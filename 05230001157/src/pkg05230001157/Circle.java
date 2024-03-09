package pkg05230001157;
    
public class Circle {
    private double radius;
    private double area;
    private double perimeter;
    
    public Circle() {
        radius = 1;
    }
    
    public Circle(double radius, int number) {
        if(radius < 0) {
            System.out.println("Negative values for radius is not allowed when assinging values");
            return;
        }
        this.radius = radius;
        area = getArea();
        perimeter = getPerimeter();
        
        System.out.printf("Radius of the %d.", number);
        System.out.printf("circle is %.2f", radius);
        System.out.println();
        System.out.printf("Area of the %d.", number);
        System.out.printf("circle is %.2f", area);
        System.out.printf(" and the perimeter of the circle is %.2f", perimeter);
        System.out.println();
    }
    
    public Circle(Circle copyCircle) {
        this.radius = copyCircle.getRadius();
    }
    
    public double getRadius() { return radius; }
    public void setRadius(double radius) { 
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    
    public boolean equals(Circle otherCircle) {
        boolean result = true;
        if(otherCircle == null || this != otherCircle) {
            System.out.println("These two circle objects are not equal.");
            result = false;
        }
        else{
            System.out.println("These two circle objects are equal.");
        }
        return result;
    }
}
