package TkJava.TKU15;

public class GenericMethods {
    public <T,U> void f(T x, U y, Double z){
        System.out.println(x.getClass().getName() + " " +
                y.getClass().getName() + " "+
        z.getClass().getName());

    }
    public static void main(String[] args){
        GenericMethods gm = new GenericMethods();
        gm.f(1,"sss",0.1);
    }
}
