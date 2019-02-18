package DesignModel.abstractFactory;

public class ThirdPayFactory extends AbstractFactory {
    @Override
    public ThirdPay getPayWay(payVo vo) {
        if ("1".equals(vo.getPaymentWay())){
            return new WeChatPay();
        }else if ("2".equals(vo.getPaymentWay())){
            return new Alipay();
        }else {
            return null;
        }
    }
}
