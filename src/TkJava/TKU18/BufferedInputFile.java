package TkJava.TKU18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class BufferedInputFile {
    public static String read(String filename) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String[] temp = filename.split("\\.");
        //String file = temp[0] + "Reversed." + temp[1];
        //PrintWriter out =new PrintWriter(file);
        LinkedList list = new LinkedList();
        String s;
        //int lineCount = 1;
        List<String> list1 = Arrays.asList("Ex4");
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine())!= null){
            //sb.append(s + "\n");
            //List<String> line = Arrays.asList(s.split("\\W+"));
            //if (!Collections.disjoint(line,list1)) {
                list.add(/*lineCount++ + " " + */s);
           // }
        }
        while (list.peekLast() != null){
            String t = (String)list.pollLast();
            //out.println(t);
            sb.append(t + "\n");
        }
        Collections.reverse(list);
        in.close();
        //out.close();
        return sb.toString();
    }
    public static void main(String[] args) throws IOException{
        System.out.print(read("Ex4.java"));
    }
}
