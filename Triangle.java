// 11.1 

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
               " side3 = " + side3;
    }
}



/*
          GeometricObject            
 - color: String                     
 - filled: boolean                   
 - dateCreated: java.util.Date   

 + GeometricObject()                 
 + GeometricObject(color: String, filled: boolean) 
 + getColor(): String                
 + setColor(color: String): void     
 + isFilled(): boolean               
 + setFilled(filled: boolean): void  
 + getDateCreated(): java.util.Date  
 + toString(): String                

 * 
 */

/*
               Triangle              |

 - side1: double                     
 - side2: double                     
 - side3: double                     

 + Triangle()                        
 + Triangle(side1: double, side2: double, side3: double) 
 + getSide1(): double                
 + getSide2(): double                
 + getSide3(): double                
 + getArea(): double                 
 + getPerimeter(): double            
 + toString(): String                

 + Triangle(side1: double, side2: double, side3: double, color: String, filled: boolean) 
 * 
 */