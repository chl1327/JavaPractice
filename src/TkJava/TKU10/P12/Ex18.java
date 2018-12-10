package TkJava.TKU10.P12;


import static print.Print.print;

public class Ex18 {
    Ex18() { System.out.println("Ex18()"); }

    private class Ex18Inner{
        Ex18Inner() { print("Ex18Inner");}
        private class Ex18InnerInner{
            Ex18InnerInner (){ print("Ex18InnerInner");}
        }
    }

    private static class Ex18Nest{
        Ex18Nest() { print("Ex18Nest");}
        private static class Ex18NestNest{
            Ex18NestNest (){ print("Ex18NestNest");}
        }
    }


    public static class Ex18Nest1 {
        Ex18Nest1() { System.out.println("Ex18Nest1()"); }
    }
    private static class Ex18Nest2 {
        Ex18Nest2() { System.out.println("Ex18Nest2()"); }
    }
    public static void main(String[] args) {
        Ex18Nest1 en1 = new Ex18Nest1();
        Ex18Nest2 en2 = new Ex18Nest2();

        Ex18Nest en = new Ex18Nest();
        Ex18Nest.Ex18NestNest enn = new Ex18Nest.Ex18NestNest();
        Ex18 e19 = new Ex18();
        Ex18.Ex18Inner ei = e19.new Ex18Inner();
        Ex18.Ex18Inner.Ex18InnerInner eii = ei.new Ex18InnerInner();
    }
}
