package TkJava.TKU18;

import java.io.*;

public class BasicFileOutput {
    static String file = "Ex4.out";
    public static void main(String[] args) throws IOException{
        LineNumberReader in = new LineNumberReader(new FileReader("Ex4.java"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)
        ));
        //int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null){
            out.println(in.getLineNumber() + ": " +s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
