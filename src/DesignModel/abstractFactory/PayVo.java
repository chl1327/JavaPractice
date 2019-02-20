package DesignModel.abstractFactory;

public class PayVo {
    private String payBusiness;
    private String paymentType;
    private String paymentScene;
    private String bizParam;

    public String getBizParam() {
        return bizParam;
    }

    public void setBizParam(String bizParam) {
        this.bizParam = bizParam;
    }

    public String getPayBusiness() {
        return payBusiness;
    }

    public void setPayBusiness(String payBusiness) {
        this.payBusiness = payBusiness;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentScene() {
        return paymentScene;
    }

    public void setPaymentScene(String paymentScene) {
        this.paymentScene = paymentScene;
    }
}
