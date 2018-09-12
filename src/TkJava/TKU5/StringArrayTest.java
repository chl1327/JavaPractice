package TkJava.TKU5;

import java.util.ArrayList;
import java.util.List;

public class StringArrayTest {

    String str;

    public StringArrayTest(){
        System.out.println("construct str ="+this.str);
    }

    public void getStringList(String ... args){
        for(String arg: args){
            System.out.println(arg);
        }
    }

    public static void main(String... args){
        for(String arg: args){
            System.out.println(arg);
        }
        String[] strs = {"123","321","432"};
        StringArrayTest[] arrayTests = {new StringArrayTest(),new StringArrayTest()};
        StringArrayTest stringArrayTest = new StringArrayTest();
        stringArrayTest.getStringList(strs);
        stringArrayTest.getStringList("1323","23232","24rff","23ff");
    }
}
