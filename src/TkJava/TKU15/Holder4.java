package TkJava.TKU15;

class Robot {
    private String name;
    public Robot(){}
    public Robot(String name) { this.name = name; }
    public String toString() {
        return name;
    }
}

public class Holder4<T> {
    private T x, y, z;
    public Holder4(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setX(T x) { this.x = x; }
    public void setY(T y) { this.y = y; }
    public void setZ(T z) { this.z = z; }
    public T getX() { return x; }
    public T getY() { return y; }
    public T getZ() { return z; }
    public String toString() {
        return x + ", " + y + ", " + z;
    }
    public static void main(String[] args) {
        Robot a = new Robot("bot1");
        Robot b = new Robot("bot2");
        Robot c = new Robot("bot3");
        Holder4<Robot> hEx2 =
                new Holder4<Robot>(a, b, c);
        System.out.println("Holding: " + hEx2);
    }
}
