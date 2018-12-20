package TkJava.TKU12;

class LevelOneException extends Exception {}
class LevelTwoException extends LevelOneException {}
class LevelThreeException extends LevelTwoException {}


class A {
    public void Test() throws LevelOneException{
        throw new LevelOneException();
    }
}

class B extends A{
    @Override
    public void Test()throws LevelTwoException{
        throw new LevelTwoException();
    }
}

class C extends B{
    public void Test()throws LevelThreeException{
        throw new LevelThreeException();
    }
}



public class Ex25 {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.Test();
        }	catch(LevelThreeException e3) {
            System.out.println("Caught e3");
        }	catch(LevelTwoException e2) {
            System.out.println("Caught e2");
        }	catch(LevelOneException e1) {
            System.out.println("Caught e1");
        }
    }
}
