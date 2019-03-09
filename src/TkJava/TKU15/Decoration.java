package TkJava.TKU15;

import java.util.Date;

class BasicD{
    private String value;
    public void set(String val){
        value = val;
    }
    public String get(){return value;}
}

class Decoratorr extends BasicD{
    protected BasicD basicD;
    public Decoratorr(BasicD basicD){
        this.basicD = basicD;
    }
    public void set(String val){basicD.set(val);}
    public String get(){ return basicD.get(); }
}

class TimeStampedd extends Decoratorr{
    private final long timeStamp;
    public TimeStampedd(BasicD basicD){
        super(basicD);
        timeStamp = new Date().getTime();
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}

class SerialNumberedd extends Decoratorr{
    private static long counter = 1;
    private final long serialNumber = counter++;
    public SerialNumberedd(BasicD basicD){ super(basicD);}
    public long getSerialNumber() {return serialNumber;}
}

public class Decoration {
    public static void main(String[] args){
        TimeStampedd t = new TimeStampedd(new BasicD());
        TimeStampedd t2 = new TimeStampedd(new SerialNumberedd(new BasicD()));
        SerialNumberedd s = new SerialNumberedd(new BasicD());
        SerialNumberedd s2 = new SerialNumberedd(new TimeStampedd(new BasicD()));
    }
}
