package TkJava.TKU13;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex17 {
    private String[] s = {"JGrep15.java"};

    public static void main(String[] args) throws Exception {
        Ex17 e = new Ex17();
        if(e.s.length < 1) {
            System.out.println("Usage: fileName");
            System.exit(0);
        }
        //Pattern p = Pattern.compile("(//\\s.+)|(/\\*\\s+.+)|(\\*\\s+.+)");
        //Pattern p = Pattern.compile("\".*\"");
        Pattern p = Pattern.compile("class \\w+\\s+");
        // not including those in comment lines:
        Pattern q = Pattern.compile("^(//|/\\*|\\*)");
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher(""); // creates emtpy Matcher object
        Matcher n = q.matcher("");
        System.out.println(e.s[0] + " comments: ");
        for(String line : new TextFile(e.s[0])) {
            m.reset(line);
            n.reset(line);
            while(m.find() && !n.find())
                System.out.println(index++ + ": " + m.group());
        }
    }
}
