package DesignModel.abstractFactory;

import DesignModel.abstractFactory.alipaychannel.AlipayChannel;

public class ThirdPayFactory {

    public ThirdPayChannel getChannel(PayVo vo){
        if (vo.getPaymentType().equals("1")){
            return new AlipayChannel();
        }else {
            return null;
        }
    }

}
