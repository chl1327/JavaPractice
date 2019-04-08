package TkJava.TKU18;

import net.mindview.util.OSExecute;

import static print.Print.println;

public class OSExecuteDemo extends Object {
    public static void main(String[] args){
        for(String s : OSExecute22.command("javap OSExecute22Test"))
            println(s);
    }
}
