package TkJava.TKU12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Ex3 {
    private static int[] ia = new int[2];
    private static Logger logger = Logger.getLogger("LoggingException");
    static void logException(Exception e) { // Exception e argument
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            ia[2] = 3;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(
                    "Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            //logException(e);
            throw new RuntimeException(e);
        }
    }
}