package TkJava;

import TkJava.TKU6.TestAuthor;
import TkJava.TKU6.*;
import TkJava.TKU6.debugoff.BuildTest;
import TkJava.TkU2.ATypeName;
import TkJava.TkU2.DataOnly;
import TkJava.TkU2.Practise;

import static print.Print.print;

/**
 * Created by chl1327 on 2018/8/8.
 */
public class Test {

    public static void main(String[] args){
        Test test = new Test();
        test.Test7();
    }


    public void Test1(){
        Practise practise = new Practise();
        Practise practise1 = new Practise();
        System.out.println(practise1.toString());
        System.out.println(practise.toString());
        practise.increment();
        System.out.println(practise1.toString());
        System.out.println(practise.toString());
        System.out.println(practise.storage("1111"));
    }


    public void Test2(){
        System.out.println("Hello,World");
    }


    public void Test3(){
        ATypeName aTypeName = new ATypeName();
        System.out.println(aTypeName.toString());
    }

    public void Test4(){
        DataOnly dataOnly = new DataOnly();

    }

    public void Test5(String[] args){
        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);
        System.out.println("args[2] = " + args[2]);
    }

    public void Test6(){
        TestAuthor testAuthor = new TestAuthor();
        print(testAuthor.toString());
        Vector vector = new Vector();
    }

    public void Test7(){
        BuildTest BuildTest = new BuildTest();
        BuildTest.debug("1");
    }

}
