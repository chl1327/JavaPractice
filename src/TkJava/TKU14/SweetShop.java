package TkJava.TKU14;

import static print.Print.print;

class Candy{
    static { print("Loading Candy"); }
}

class Gum {
    static { print("Loading Gum"); }
}

class Cookie {
    static  { print("Loading Cookie");}
}

public class SweetShop {
    String s = "TkJava.TKU14.Candy";
    public static void main(String[] args){
        SweetShop ss = new SweetShop();
        Class c = null;
        print("inside main");
        new Gum();
        print("After creating Gum");
        new Cookie();
        print("After creating Cookie");
        try{
           c =  Class.forName(ss.s);
           print("Enjoy " +c.getSimpleName());
        }catch (ClassNotFoundException e){
            print("Couldn't find " + ss.s);
        }
        print("After Class.forNme(\""+ ss.s+ "\")");

    }
}
