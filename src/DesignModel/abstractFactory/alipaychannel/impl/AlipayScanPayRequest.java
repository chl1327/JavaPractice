package DesignModel.abstractFactory.alipaychannel.impl;

import DesignModel.abstractFactory.alipaychannel.AlipayRequest;

public class AlipayScanPayRequest implements AlipayRequest {
    @Override
    public String getMethodName(){
        return "";
    }

    @Override
    public Class<AlipayScanPayResponse> getResponseClass(){
        return AlipayScanPayResponse.class;
    }


    @Override
    public AlipayScanPayResponse excute (AlipayRequest alipayRequest){
        return new AlipayScanPayResponse();
    }
}
