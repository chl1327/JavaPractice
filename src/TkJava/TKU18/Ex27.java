package TkJava.TKU18;

import java.io.*;

import static print.Print.println;

class A implements Serializable{
    private char c;
    private B b;
    A(char c, B b) {
        this.c = c;
        this.b = b;
    }
    public String toString() {
        return "B:" + c + " " + b;
    }
}

class B implements Serializable{
    int i = 1;
    B(int i){
        this.i = i;
    }
    public String toString() { return "B:" + i; }
}

public class Ex27 {
    public static void main(String[] args) throws ClassNotFoundException,IOException{
        A a = new A('c',new B(2));
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ex27.out"));
        out.writeObject(a);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("ex27.out"));
        A a1 = (A) in.readObject();
        println(a1.toString());
    }
}
