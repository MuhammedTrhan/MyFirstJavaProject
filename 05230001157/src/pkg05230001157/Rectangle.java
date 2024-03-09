package pkg05230001157;

public class Rectangle {
    private double width;
    private double height;
    private double area;
    private double perimeter;
    
    public Rectangle() {
        width = 1;
        height = 1;
    }
    
    public Rectangle(double width, double height, int number) {
        if(width < 0 || height < 0) {
            System.out.println("Negative values for width and height are not allowed when assinging values");
            return;
        }
        this.width = width;
        this.height = height;
        
        area = getArea();
        perimeter = getPerimeter();
        
        System.out.printf("Width of the %d.", number);
        System.out.printf("rectangle is %.2f", width);
        System.out.printf(" and the height of the rectangle is %.2f", height);
        System.out.println("");
        System.out.printf("Area of the %d.", number);
        System.out.printf("rectangle is %.2f", area);
        System.out.printf(" and the perimeter of the rectangle is %.2f", perimeter);
        System.out.println("");
    }
    
    public Rectangle(Rectangle copyRectangle) {
        this.width = copyRectangle.getWidth();
        this.height = copyRectangle.getHeight();
        
        area = getArea();
        perimeter = getPerimeter();
        
        System.out.printf("Width of the copy rectangle is %.2f", width);
        System.out.printf(" and the height of the rectangle is %.2f", height);
        System.out.println("");
        System.out.printf("Area of the copy rectangle is %.2f", area);
        System.out.printf(" and the perimeter of the rectangle is %.2f", perimeter);
        System.out.println("");
    }
    
    public double getWidth() { return width; }
    public void setWidth(double width) { 
        this.width = width;
        area = getArea();
    }
    
    public double getHeight() { return height; }
    public void setHeight(double height) { 
        this.height = height;
        area = getArea();
    }
    
    public double getArea(){
        area = width * height;
        return area;
    }
    
    public double getPerimeter(){
        return (width + height) * 2;
    }
    
    public void equals(Rectangle otherRectangle) {
        if(this.width == otherRectangle.width && this.height == otherRectangle.height) {
            System.out.println("These two Rectangle objects are equal.");
        }
        else{
            System.out.println("These two Rectangle objects are not equal.");
        }

    }
}
