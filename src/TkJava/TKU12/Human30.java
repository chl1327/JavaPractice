package TkJava.TKU12;

import static net.mindview.util.Print.print;

class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}


class WrapCheckedExceptions {
    void throwRuntimeException(int type) {
        try {
            switch(type) {
                case(0):
                    throw new Annoyance();
                case(1):
                    throw new Sneeze();
                case(2):
                    throw new RuntimeException("Where am I?");
                default: return;
            }
        } 	catch(Exception e) {
            // Adapt to unchecked:
            throw new RuntimeException(e);
        }
    }
}

public class Human30 {
    public static void main(String[] args) {
        WrapCheckedExceptions wce =
                new WrapCheckedExceptions();
        for(int i = 0; i < 3; i++)
            try {
                if(i < 3)
                    wce.throwRuntimeException(i);
                else
                    throw new RuntimeException();
            }	catch(RuntimeException re) {
                try {
                    throw re.getCause();
                } 	catch(Sneeze e) {
                    print("Sneeze: " + e);
                }	catch(Annoyance e) {
                    print("Annoyance: " + e);
                }	catch(Throwable e) {
                    print("Throwable: " + e);
                }
            }
    }
}
