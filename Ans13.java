import java.util.Date;

class GeometricObject {
    private String color;
    private boolean filled;
    private final Date dateCreated = new Date();

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() 
    { 
        return color; 
    }
    public void setColor(String color) 
    { 
        this.color = color; 
    }
    public boolean isFilled() 
    { 
        return filled; 
    }
    public void setFilled(boolean filled) 
    { 
        this.filled = filled; 
    }
    public Date getDateCreated() 
    { 
        return dateCreated; 
    }
    public String toString() 
    { 
        return "Color: " + color + ", Filled: " + filled + ", Date: " + dateCreated; 
    }
}

class Circle extends GeometricObject 
{
    private double radius;

    public Circle(double radius, String color, boolean filled) 
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() 
    { 
        return radius; 
    }
    public double getArea() 
    { 
        return Math.PI * radius * radius; 
    }
    public double getPerimeter() 
    { 
        return 2 * Math.PI * radius; 
    }
    public double getDiameter() 
    { 
        return 2 * radius; 
    }
    public void printCircle() 
    { 
        System.out.println("Circle: Radius = " + radius); 
    }
}

class Rectangle extends GeometricObject 
{
    private double width, height;

    public Rectangle(double width, double height, String color, boolean filled) 
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getArea() 
    { 
        return width * height; 
    }
    public double getPerimeter() 
    { 
        return 2 * (width + height); 
    }
}

public class Ans13 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5, "Red", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());
        circle.printCircle();

        Rectangle rectangle = new Rectangle(4.0, 7.0, "Blue", false);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());
    }
}
