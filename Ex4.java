package TkJava.TKU17;

import net.mindview.util.TextFile;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

import static print.Print.println;

public class Ex4 {
    static Collection<String> CollectFromText(String fileName) {
        String[] sa = TextFile.read(fileName).split(" ");
        return Arrays.asList(sa);
    }
    static Collection<String> CollectFromText2(String fileName) {
        String[] sa = TextFile.read(fileName).split(" ");
        return new TreeSet<String>(new TextFile(fileName, "\\W+"));
    }
    public static void main(String[] args) {
        println(CollectFromText("Ex4.java"));
        println(CollectFromText2("Ex4.java"));
    }
}
