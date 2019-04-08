package TkJava.TKU18;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class DoubleBufferDemo {
    private static final int BSIZE = 1024;
    public static void main(String[] args){
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        DoubleBuffer db = bb.asDoubleBuffer();
        db.put(new double[]{1.0,2.0,3.09,0.12,33.2});
        System.out.println(db.get(3));
        db.put(3,111.2);
        db.flip();
        while (db.hasRemaining()){
            double i = db.get();
            System.out.println(i);
        }
    }
}
