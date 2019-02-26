package TkJava.TKU15;

import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

import static net.mindview.util.Tuple.tuple;

public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return tuple("hi",47);
    }
    static TwoTuple f2(){ return tuple("hi", 47); }
    static ThreeTuple<Amphibian,String,Integer> g(){
        return tuple(new Amphibian(),"hi", 47);
    }

    static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return tuple(new Vehicle(),new Amphibian(),"hi",47);
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){
        return tuple(new Vehicle(),new Amphibian(),"hi",47,11.1);
    }
    static SixTuple<Vehicle,Amphibian,String,Integer,Double,Long> s(){
        return TkJava.TKU15.Tuple.tuple(new Vehicle(),new Amphibian(),"hi",47,11.1,11L);
    }
    public static void main(String[] args){
        TwoTuple<String,Integer> ttsi = f();
        TwoTuple<String,Integer> tts2 = f2();
        System.out.println(ttsi);
        System.out.println(tts2);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(s());
    }
}
