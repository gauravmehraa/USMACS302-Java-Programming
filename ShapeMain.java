abstract class Shape{
    abstract double calArea();
}
    
class Triangle extends Shape{
    double side1, side2, side3;
    
    public Triangle(){
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double calArea(){
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s- side3));
    }
}
    
class Rectangle extends Shape{
    double side1, side2;
    
    public Rectangle(){
        this.side1 = 0;
        this.side2 = 0;
    }
    
    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    
    double calArea(){
        return side1 * side2;
    }
    
    boolean isSquare(){
        return side1 == side2;
    }
}
    
class Square extends Rectangle{
    
     public Square(){
        super();
    }
    
    public Square(double side){
        super(side, side);
    }
    
    double calArea(){
        return Math.pow(side1, 2);
    }
}
    
public class ShapeMain{
    public static void main(String args[]){
        Shape shape;
    
        shape = new Triangle(3, 4, 5);
        System.out.println("Area of Triangle = "+shape.calArea());
    
        shape = new Rectangle(5, 10);
        System.out.println("Area of Rectangle = "+shape.calArea());

        shape = new Square(3);
        System.out.println("Area of Square = " + shape.calArea());
            
    }
}
    
