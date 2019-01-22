package TkJava.TKU13;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep15 {
    private String[] s = {"JGrep15.java","\\b[Ssct]\\w+","Pattern.CASE_INSENSITIVE"};
    public static void main(String[] args) throws Exception {
        JGrep15 J = new JGrep15();
        if(J.s.length < 3) {
            System.out.println("Usage: java JGrep file regex flag");
            System.exit(0);
        }
        int flag = 0;
        if(J.s[2].equals("Pattern.CASE_INSENSITIVE"))
            flag = Pattern.CASE_INSENSITIVE;
        else if(J.s[2].equals("Pattern.CANON_EQ"))
            flag = Pattern.CANON_EQ;
        else if(J.s[2].equals("Pattern.COMMENTS"))
            flag = Pattern.COMMENTS;
        else if(J.s[2].equals("Pattern.DOTALL"))
            flag = Pattern.DOTALL;
        else if(J.s[2].equals("Pattern.LITERAL"))
            flag = Pattern.LITERAL;
        else if(J.s[2].equals("Pattern.MULTILINE"))
            flag = Pattern.MULTILINE;
        else if(J.s[2].equals("Pattern.UNICODE_CASE"))
            flag = Pattern.UNICODE_CASE;
        else if(J.s[2].equals("Pattern.UNIX_LINES"))
            flag = Pattern.UNIX_LINES;
        Pattern p = Pattern.compile(J.s[1], flag);
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher(""); // creates empty Matcher object
        for(String line : new TextFile(J.s[0])) {
            m.reset(line);
            while(m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }
    }
}
