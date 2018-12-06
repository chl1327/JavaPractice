package TkJava.TKU10.P4.P41;

import TkJava.TKU10.P4.Ex6Interface;

public class Ex6Base {
    protected class Ex6BaseInner implements Ex6Interface {
        // need public constructor to create one in Ex6Base child:
        public Ex6BaseInner() {
        }

        public String say() {
            return "Hi";
        }
    }
}
