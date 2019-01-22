package TkJava.TKU13;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep16 {
    private String[] s = {"D:/GIT/JavaPractise/JavaPractice/src/TkJava/TKU13/JGrep15.java","\\b[Ssct]\\w+"};

    public static void main(String[] args) throws Exception {
        JGrep16 j = new JGrep16();
        if(j.s.length < 2) {
            System.out.println("Usage: java JGrep (file or directory) regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(j.s[1]);
        Matcher d = Pattern.compile("\\w+\\.{1}\\w+").matcher(j.s[0]);
        if(d.find()) {
            System.out.println("File: " + j.s[0]);
            // Iterate through the lines of the input file:
            int index = 0;
            Matcher m = p.matcher(""); // creates emtpy Matcher object
            for(String line : new TextFile(j.s[0])) {
                m.reset(line);
                while(m.find())
                    System.out.println(index++ + ": " +
                            m.group() + ": " + m.start());
            }
        }
        Matcher e = Pattern.compile("^\\.{1}$").matcher(j.s[0]);
        if(e.find()) {
            File[] files = new File(j.s[0]).listFiles();
            System.out.println("root dir of files: " + Arrays.asList(files));
            // Iterate through the lines of each file in directory:
            for(File f : files) {
                if(f.getName().matches("\\w+\\.{1}\\w+")) {
                    System.out.println(f.getName() + ":");
                    int index = 0;
                    Matcher m = p.matcher(""); // creates emtpy Matcher object
                    for(String line : new TextFile(f.getName())) {
                        m.reset(line);
                        while(m.find())
                            System.out.println(index++ + ": " +
                                    m.group() + ": " + m.start());
                    }
                }
                System.out.println();
            }
        }
        d.reset();
        e.reset();
        if(!(d.find() || e.find())) {
            if(new File(j.s[0]).listFiles() == null) {
                System.out.println("no such directory: " + j.s[0]);
                System.exit(0);
            }
            File[] files = new File(j.s[0]).listFiles();
            System.out.println(j.s[0] + ": subdir of files: " + Arrays.asList(files));
            // Iterate through the lines of each file in directory:
            for(File f : files) {
                int index = 0;
                Matcher m = p.matcher(""); // creates emtpy Matcher object
                for(String line : new TextFile(j.s[0] + "\\" + f.getName())) {
                    m.reset(line);
                    while(m.find())
                        System.out.println(index++ + ": " +
                                m.group() + ": " + m.start());
                }
                System.out.println();
            }
        }
    }
}
