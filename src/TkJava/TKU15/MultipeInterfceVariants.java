package TkJava.TKU15;

interface Payable{ float getPay();}

class Employee implements Payable{
    private float weeklyPay;
    public float getPay() {
        return weeklyPay;}
}


class Hourly extends Employee {
    public String name;
    protected float hourlyPay;
    public int hoursWorked;
    Hourly(String s, float pay, int hours) {
        name = s;
        hourlyPay = pay;
        hoursWorked = hours;
    }
    public float getPay() {
        System.out.println("Pay " + name +
                " $" + hourlyPay * hoursWorked);
        return hourlyPay * hoursWorked;
    }
}

public class MultipeInterfceVariants {
    public static void main(String[] args){
        Hourly h = new Hourly("Joe", 50.00f, 40);
        h.getPay();
    }
}
