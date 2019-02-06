package TkJava.TKU14.factory;

import net.mindview.util.Print;
import net.mindview.util.TypeCounter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static print.Print.print;
import static print.Print.println;
import static print.Print.printnb;

class Part{
    public String toString(){
        return getClass().getSimpleName();
    }
    /*static List<Factory<? extends Part>> partFactories =
            new ArrayList<Factory<? extends Part>>();*/
    static List<Class<? extends Part>> partClasses =
            new ArrayList<>();
    static {
        /*partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());*/
        partClasses.add(FuelFilter.class);
        partClasses.add(AirFilter.class);
        partClasses.add(CabinAirFilter.class);
        partClasses.add(OilFilter.class);
        partClasses.add(FanBelt.class);
        partClasses.add(PowerSteeringBelt.class);
        partClasses.add(GeneratorBelt.class);

    }
    private static Random rand = new Random(47);
    public static Part createRandom(){
        /*int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();*/
        int n = rand.nextInt(partClasses.size());
        try {
            return partClasses.get(n).newInstance();
        } catch(InstantiationException e) {
            throw new RuntimeException(e);
        } catch(IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

class Filter extends Part{}

class FuelFilter extends Filter{
    public static class Factory implements TkJava.TKU14.factory.Factory<FuelFilter>{
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter{
    public static class Factory implements TkJava.TKU14.factory.Factory<AirFilter>{
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter{
    public static class Factory implements TkJava.TKU14.factory.Factory<CabinAirFilter>{
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter{
    public static class Factory implements TkJava.TKU14.factory.Factory<OilFilter>{
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part{}

class FanBelt extends Belt{
    public static class Factory implements TkJava.TKU14.factory.Factory<FanBelt>{
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt{
    public static class Factory implements TkJava.TKU14.factory.Factory<GeneratorBelt>{
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt{
    public static class Factory implements TkJava.TKU14.factory.Factory<PowerSteeringBelt>{
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}

public class RegisteredFactories {
    public static void main(String[] args){
        TypeCounter counter = new TypeCounter(Part.class);
        for(int i = 0; i< 10; i++)
            println(Part.createRandom());
        List<Part> partList = new ArrayList<Part>();
        for(int i = 0; i < 20; i++)
            partList.add(Part.createRandom());
        for(Part part : partList) {
            Print.printnb(part.getClass().getSimpleName() + " ");
            counter.count(part);
        }
        Print.print();
        Print.print(counter);
    }
}
