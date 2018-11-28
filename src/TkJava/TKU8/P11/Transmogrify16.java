package TkJava.TKU8.P11;

import static print.Print.println;

class AlertStatus {
    public void alert() {}
}

class NormalAlert extends AlertStatus {
    public void alert() { println("AlertStatus Normal"); }
}

class HighAlert extends AlertStatus {
    public void alert() { println("AlertStatus High"); }
}

class MaximumAlert extends AlertStatus {
    public void alert() { println("AlertStatus Maximum"); }
}

class Starship {
    private AlertStatus alertStatus = new NormalAlert();
    public void normalAlert() { alertStatus = new NormalAlert(); }
    public void highAlert() { alertStatus = new HighAlert(); }
    public void maximumAlert() { alertStatus = new MaximumAlert(); }
    public void checkAlertStatus() { alertStatus.alert(); }
}

public class Transmogrify16 {
    public static void main(String[] args) {
        Starship ss = new Starship();
        ss.checkAlertStatus();
        ss.highAlert();
        ss.checkAlertStatus();
        ss.maximumAlert();
        ss.checkAlertStatus();
        ss.normalAlert();
        ss.checkAlertStatus();
    }
}