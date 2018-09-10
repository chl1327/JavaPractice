package TkJava.TKU5;

import java.awt.*;

public class StringNewTest {
    String sne;

    StringNewTest(String sne){
        this.sne = sne;
        System.out.println(this.sne);
    }

    public static void main(String[] args){
        StringNewTest newTest = new StringNewTest("122");
        System.out.println("complete");
    }
}
