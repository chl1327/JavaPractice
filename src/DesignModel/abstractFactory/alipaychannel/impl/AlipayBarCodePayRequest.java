package DesignModel.abstractFactory.alipaychannel.impl;

import DesignModel.abstractFactory.alipaychannel.AlipayRequest;

public class AlipayBarCodePayRequest implements AlipayRequest {
    @Override
    public String getMethodName(){
        return "";
    }

    @Override
    public Class<AlipayBarCodePayResponse> getResponseClass(){
        return AlipayBarCodePayResponse.class;
    }


    @Override
    public AlipayBarCodePayResponse excute (AlipayRequest alipayRequest){
        return new AlipayBarCodePayResponse();
    }
}
