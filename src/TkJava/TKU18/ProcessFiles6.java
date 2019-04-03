package TkJava.TKU18;

import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class ProcessFiles6 {
    public interface Strategy{
        void process(File file);
    }
    private Strategy strategy;
    private String regex;
    public ProcessFiles6(Strategy strategy, String regex){
        this.strategy = strategy;
        this.regex = regex;
    }
    public void start(String[] args){
        try{
            if (args.length == 0){
                processDirectoryTree(new File("."));
            }else {
                for (String arg : args){
                    File fileArg = new File(arg);
                    if (fileArg.isDirectory()){
                        processDirectoryTree(fileArg);
                    }else {
                        Pattern pattern = Pattern.compile(regex);
                        if(pattern.matcher(arg).matches()) {
                        /*if (!arg.endsWith("." + ext)){
                            arg += "."+ ext;
                        }*/
                            strategy.process(new File(arg).getCanonicalFile());
                        }
                    }
                }
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public void processDirectoryTree(File root) throws IOException{
        final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        for (File file: Directory.walk(root.getAbsolutePath(),regex)){
            Date modDate = new Date(file.lastModified());
            try {
                if (modDate.after(sdf.parse("02/03/2019"))) {
                    strategy.process(file.getCanonicalFile());
                }
            }catch (Exception e){

            }
        }
    }
    public static void main(String[] args){
        new ProcessFiles6(new ProcessFiles6.Strategy(){
            public void process(File file){
                System.out.println(file);
            }
        },"T.*\\.java").start(args);
    }
}
