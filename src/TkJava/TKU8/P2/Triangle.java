package TkJava.TKU8.P2;

import static print.Print.print;

public class Triangle extends Shape {
    @Override public void draw() { print("Triangle.draw()"); }
	@Override public void erase() { print("Triangle.erase()"); }
    @Override public void fill() {print("Triangle fill()");}

}
