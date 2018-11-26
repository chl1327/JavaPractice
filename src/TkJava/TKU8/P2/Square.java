package TkJava.TKU8.P2;

import static print.Print.print;

public class Square extends Shape{
    @Override public void draw() { print("Square.draw()"); }
	@Override public void erase() { print("Square.erase()"); }
    @Override public void fill() {print("Square fill()");}

}
