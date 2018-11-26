package TkJava.TKU8.P2;

import static print.Print.print;

public class Circle extends Shape {
    @Override public void draw() { print("Circle.draw()"); }
	@Override public void erase() { print("Circle.erase()"); }
	@Override public void fill() {print("Circle fill()");}
}
