package TkJava.TKU18;

import TkJava.TKU11.Event;
import TkJava.TKU11.GreenhouseControls24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GreenhouseController11 {
    public static Map<String,Long> readEvents(String filename)
            throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        Map<String,Long> map = new HashMap<String,Long>();
        while((s = in.readLine()) != null) {
            String [] sa = s.split("[()]");
            map.put(sa[0], new Long(sa[1]));
        }
        in.close();
        return map;
    }
    // To build Event objects from Map.Entry objects:
    private static Event makeEvent(GreenhouseControls24 gc, Map.Entry<String,Long> me) {
        String key = me.getKey();
        Long value = me.getValue();
        if(key.equals("Bell")) return gc.new Bell(value);
        if(key.equals("LightOn")) return gc.new LightOn(value);
        if(key.equals("LightOff")) return gc.new LightOff(value);
        if(key.equals("WaterOn")) return gc.new WaterOn(value);
        if(key.equals("WaterOff")) return gc.new WaterOff(value);
        if(key.equals("ThermostatDay")) return gc.new ThermostatDay(value);
        if(key.equals("ThermostatNight")) return gc.new ThermostatNight(value);
        return null;
    }
    public static void main(String[] args) {
        GreenhouseControls24 gc = new GreenhouseControls24();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        try {
            // Read text and convert lines to map entries:
            Map<String,Long> map = readEvents("Events.txt");
            Event[] eventList = new Event[map.size()];
            int i = 0;
            // Make events from map and add to Event array:
            for(Map.Entry<String,Long> me : map.entrySet()) {
                eventList[i++] = makeEvent(gc, me);
            }
            gc.addEvent(gc.new Restart(2000, eventList));
            if(args.length != 1) {
                System.out.println("Usage: enter integer terminate time");
                System.exit(0);
            }
            if(args.length == 1)
                gc.addEvent(new GreenhouseControls24.Terminate(
                        new Integer(args[0])));
            gc.run();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

