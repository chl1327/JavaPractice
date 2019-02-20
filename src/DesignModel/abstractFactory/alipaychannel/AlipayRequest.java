package DesignModel.abstractFactory.alipaychannel;

import DesignModel.abstractFactory.alipaychannel.impl.AlipayResponse;

public interface AlipayRequest<T> {
    String getMethodName();

    Class<T> getResponseClass();

    <T extends AlipayResponse> T excute(AlipayRequest alipayRequest);
}
