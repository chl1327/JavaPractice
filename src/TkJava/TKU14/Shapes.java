package TkJava.TKU14;

import java.util.Arrays;
import java.util.List;

abstract class Shape{
    void draw() { System.out.println(this + ".draw()");}
    abstract public String toString();
}

class Circle extends Shape{
    boolean flag = false;
    public String toString(){ return (flag? "H": "Uhn") + "is" +"Circle"; }
}

class Square extends Shape{
    boolean flag = false;
    public String toString(){ return (flag? "H": "Uhn") + "is" +"Square"; }
}

class Triangle extends Shape{
    boolean flag = false;
    public String toString(){ return (flag? "H": "Uhn") + "is" +"Triangle"; }
}

class Rhomboid extends Shape{
    boolean flag = false;
    public String toString(){ return (flag? "H": "Uhn") + "is" +"Rhomboid"; }
}

public class Shapes {
    public static void rotate(Shape s) {
        if(!(s instanceof Circle))
            System.out.println(s + " rotate");
    }
    public static void setFlag(Shape s) {
        if(s instanceof Triangle)
            ((Triangle)s).flag = true;
    }
    public static void main(String[] args){
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(),new Rhomboid()
        );
        for(Shape shape: shapeList)
            shape.draw();
        Rhomboid r = new Rhomboid();
        ((Shape)r).draw();
        // inconvertible types:
        // ((Circle)r).draw();
        Shape s = (Shape)r;
        s.draw();
        // check type before downcast:
        if(s instanceof Circle)
            ((Circle)s).draw();
        else
            System.out.println("(Shape)r is not a Circle");
        System.out.println();
        for(Shape shape : shapeList)
            rotate(shape);
        for (Shape shape : shapeList){
            setFlag(shape);
            System.out.println(shape);
        }
    }
}
