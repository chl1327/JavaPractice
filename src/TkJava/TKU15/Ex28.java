package TkJava.TKU15;

import TkJava.TKU15.pets.Dog;
import TkJava.TKU15.pets.Pet;
import TkJava.TKU15.pets.Pug;
import sun.net.www.content.text.Generic;

import static print.Print.println;

class Generic1<T>{
    T t;
    void gen1(T t){
        this.t = t;
        println("gen1" + t + ".");
    }
}

class Generic2<T> {
    T t;
    T gen2() {
        return t;
    }
}
public class Ex28 {
    <T> void contra(Generic1<? super T> g1t, T t) {
        g1t.gen1(t);
    }
    <T> T co(Generic2<? extends T> g2t) {
        return g2t.gen2();
    }
    public static void main(String[] args){
        Ex28 ex28 = new Ex28();
        ex28.contra(new Generic1<Pet>(),new Dog());
        ex28.co(new Generic2<Pet>());
    }
}
