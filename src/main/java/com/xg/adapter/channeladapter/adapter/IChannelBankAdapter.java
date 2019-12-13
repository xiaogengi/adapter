package com.xg.adapter.channeladapter.adapter;

public interface IChannelBankAdapter {
//
//    void u51(String idCard);
//
//    void u61(String idCard,String idCard1,String idCard2);
//
//
//    void u71(String idCard,String idCard1);

    boolean support(Object adapter);

    void bank(String idCard , Object adapter);


}
