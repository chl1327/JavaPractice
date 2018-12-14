package TkJava.TKU11;

import java.util.PriorityQueue;
import java.util.Random;

class Simple extends Object {}

public class Ex28 {
    public static void main(String[] args) {
        Random rand = new Random();
        PriorityQueue<Double> d = new PriorityQueue<Double>();
        for(int i = 0; i < 10; i++)
            d.offer(rand.nextDouble() * i);
        while(d.peek() != null)
            System.out.print(d.poll() + " ");

        PriorityQueue<Simple> s = new PriorityQueue<Simple>();
        // OK to add one Simple:
        s.offer(new Simple());
        // but no more allowed; get runtime exception:
        // Simple cannot be cast to Comparable:
        s.offer(new Simple());
    }


}
