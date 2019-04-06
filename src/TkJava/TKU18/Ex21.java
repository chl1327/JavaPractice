package TkJava.TKU18;

import java.io.*;

public class Ex21 {
    public static void main(String[] args) throws IOException{
        /*BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ex21.out")));
        String s;
        while ((s = stdin.readLine()) != null && s.length() !=0){
            out.println(s);
            System.out.println(s);
        }
        out.close();*/
        File file = new File("Data21.txt");
        BufferedInputStream inFile =
                new BufferedInputStream(new
                        FileInputStream(file));
        System.setIn(inFile);
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        String s;
        while((s = stdin.readLine()) != null)
            System.out.println(s.toUpperCase());

    }
}
