package TkJava.TKU8.P2;

import static print.Print.print;

public class Rectangle extends Shape {
    @Override public void draw() { print("Rectangle.draw()"); }
	@Override public void erase() { print("Rectangle.erase()"); }
    @Override public void fill() {print("Rectangle fill()");}

}
