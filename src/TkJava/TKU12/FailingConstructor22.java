package TkJava.TKU12;

public class FailingConstructor22 {
    Integer[] ia = new Integer[2];
    String s;
    FailingConstructor22(String s) throws Exception {
        ia[0] = 0;
        ia[1] = 1;
        ia[2] = 2;
        this.s = s;
    }

    public void dispose(){}
    public static void main(String[] args) {
        try {
            FailingConstructor22 fc = new FailingConstructor22("hi");
        } catch(Exception e) {
            System.err.println("Caught Exception in main()");
            e.printStackTrace(System.err);
        } finally {

        }
    }
}