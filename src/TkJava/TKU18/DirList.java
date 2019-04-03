package TkJava.TKU18;

import net.mindview.util.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

class DirFilter implements FilenameFilter{
    private Pattern pattern;
    public DirFilter(String regex){
        pattern = Pattern.compile(regex);
    }
    @Override
    public boolean accept(File dir,String name){
        return pattern.matcher(name).matches();
    }
}

public class DirList {
    public static void main(String[] args){
        File path = new File(".");
        String[] list;
        if (args.length == 0){
            list = path.list();
        }else {
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches() && !(Collections.disjoint(
                            Arrays.asList(args),
                            new TextFile(name, "\\W+")));
                }
            });
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            System.out.println(dirItem);
        }
    }
}
