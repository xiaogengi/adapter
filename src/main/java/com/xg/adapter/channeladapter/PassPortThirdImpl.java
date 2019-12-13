package com.xg.adapter.channeladapter;

import com.xg.adapter.channeladapter.adapter.IChannelBankAdapter;
import com.xg.adapter.channeladapter.adapter.channel.U51;
import com.xg.adapter.channeladapter.adapter.channel.U61;
import com.xg.adapter.channeladapter.adapter.channel.U71;

public class PassPortThirdImpl implements IPassportThird {

    @Override
    public void BankForU51(String str) {
        processBank(str, U51.class);
    }

    @Override
    public void BankForU61(String str, String str1, String str2) {
        processBank(str, U61.class);
    }

    @Override
    public void BankForU71(String str, String str1) {
        processBank(str, U71.class);
    }



    private void processBank(String idCard, Class <? extends IChannelBankAdapter> clazz){
        try {
            IChannelBankAdapter iChannelBankAdapter = clazz.newInstance();
            if(iChannelBankAdapter.support(iChannelBankAdapter)){
                iChannelBankAdapter.bank(idCard, iChannelBankAdapter);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
