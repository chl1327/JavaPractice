package TkJava.TKU5;

public enum Money {

    YEN("日元"),
    RMB("人民币"),
    DOLLER("美元");

    private String desc;

    private Money(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args){
        for(Money m:Money.values()){
            System.out.println(m + ", ordinal "+ m.ordinal());
            switch (m){
                case RMB:
                    System.out.println(Money.RMB.getDesc());
                    break;
                case YEN:
                    System.out.println(Money.YEN.getDesc());
                    break;
                case DOLLER:
                    System.out.println(Money.DOLLER.getDesc());
                    break;
            }
        }

    }

}


