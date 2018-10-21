package TkJava.TKU6;

import static print.Print.print;

/**
 * Created by chl1327 on 2018/10/21.
 */
class SomeData {
    protected int a = 13;
}

class DataChanger {
    static void change(SomeData sd, int i) { sd.a = i; }
}

public class ProTectTest {
    public static void main(String[] args) {
        SomeData x = new SomeData();
        System.out.println(x.a);
        DataChanger.change(x, 99);
        System.out.println(x.a);
    }
}