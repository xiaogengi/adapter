package com.xg.adapter.channeladapter.adapter.channel;

import com.xg.adapter.channeladapter.ChannelBankService;
import com.xg.adapter.channeladapter.adapter.IChannelBankAdapter;

public class U71 extends ChannelBankService implements IChannelBankAdapter  {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof U71;
    }

    @Override
    public void bank(String idCard, Object adapter) {
        super.ChannelBank(idCard);
    }
}
