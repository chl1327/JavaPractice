package TkJava.TKU2;

/**
 * Created by chl1327 on 2018/8/8.
 */
public class Practise {

    int i;

    char a;

    static int k= 47;

    @Override
    public String toString() {
        return "Practise{" +
                "i=" + i +
                ", a=" + a +
                ", k=" + k +
                '}';
    }

    public  int storage(String s){
        return s.length() * 2;
    }

    public static void increment(){
        Practise.k++;
    }

}
