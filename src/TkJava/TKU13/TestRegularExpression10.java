package TkJava.TKU13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class TestRegularExpression10 {

    //private String[] s ={"Java now has regular expressions","^Java"};
    private String[] s = {"Arline ate eight apples and one orange while Anita hadn't any",
            "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b"};

    public static void main(String[] args) {
        TestRegularExpression10 t = new TestRegularExpression10();
        if(t.s.length < 2) {
            print("Usage:\njava TestRegularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        print("Input: \"" + t.s[0] + "\"");
        for(String arg : t.s) {
            print("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(t.s[0]);
            if(!m.find())
                print("No match found for " + "\"" + arg + "\"");
            m.reset();
            while(m.find()) {
                print("Match \"" + m.group() + "\" at position " +
                        m.start() + ((m.end() - m.start() < 2) ? "" :  ("-" + (m.end() - 1))));
            }
        }
    }
}
