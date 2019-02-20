package DesignModel.abstractFactory.alipaychannel;

import DesignModel.abstractFactory.AbstractChannel;
import DesignModel.abstractFactory.KxtxResponse;
import DesignModel.abstractFactory.PayVo;
import DesignModel.abstractFactory.alipaychannel.impl.AlipayResponse;
import DesignModel.abstractFactory.alipaychannel.impl.AlipayScanPayRequest;

public class AlipayChannel extends AbstractChannel {


    public AlipayRequest getRequestParam(String Bizparam){
        return new AlipayScanPayRequest();
    }
    @Override
    public KxtxResponse excute (PayVo vo){
        AlipayRequest request = getRequestParam(vo.getBizParam());
        AlipayResponse response = request.excute(request);
        KxtxResponse kxtxResponse = new KxtxResponse();
        return kxtxResponse;
    }

}
