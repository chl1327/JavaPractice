package DesignModel;

import DesignModel.abstractFactory.KxtxResponse;
import DesignModel.abstractFactory.PayVo;
import DesignModel.abstractFactory.ThirdPayChannel;
import DesignModel.abstractFactory.ThirdPayFactory;

public class Test {
    public static void main(String[] args){
        ThirdPayFactory tf = new ThirdPayFactory();
        PayVo vo = new PayVo();
        vo.setPayBusiness("1");
        vo.setPaymentType("1");
        vo.setPaymentScene("1");
        ThirdPayChannel channel = tf.getChannel(vo);
        KxtxResponse response = new KxtxResponse();
        response = channel.excute(vo);


    }
}
