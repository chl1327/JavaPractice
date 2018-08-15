package TkJava.TkU2;

/**
 * Created by chl1327 on 2018/8/15.
 */
public class DataOnly {
    int i;
    double d;
    boolean b;

    public static void main(String[] args){
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 1;
        dataOnly.d = 1.1;
        dataOnly.b =true;
        System.out.println(dataOnly.toString());
    }

    @Override
    public String toString() {
        return "DataOnly{" +
                "i=" + i +
                ", d=" + d +
                ", b=" + b +
                '}';
    }
}
