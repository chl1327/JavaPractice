package DesignModel.abstractFactory;

public abstract class AbstractChannel implements ThirdPayChannel {

    @Override
    public abstract KxtxResponse excute (PayVo vo);
}
