24 }
23     }
22         println(CollectFromText2("Ex4.java"));
21         println(CollectFromText("Ex4.java"));
20     public static void main(String[] args) {
19     }
18         return new TreeSet<String>(new TextFile(fileName, "\\W+"));
17         String[] sa = TextFile.read(fileName).split(" ");
16     static Collection<String> CollectFromText2(String fileName) {
15     }
14         return Arrays.asList(sa);
13         String[] sa = TextFile.read(fileName).split(" ");
12     static Collection<String> CollectFromText(String fileName) {
11 public class Ex4 {
10 
9 import static print.Print.println;
8 
7 import java.util.TreeSet;
6 import java.util.Collection;
5 import java.util.Arrays;
4 
3 import net.mindview.util.TextFile;
2 
1 package TkJava.TKU17;
