package com.xg.adapter.loginadapter.v2;

import com.xg.adapter.loginadapter.ResultMsg;
import com.xg.adapter.loginadapter.SiginService;

public class PassportForThirdSerivce extends SiginService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LogForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForSina(String id) {
        return processLogin(id, LoginForSinaAdapter.class);
    }

    @Override
    public ResultMsg loginForTel(String iphone, String code) {
        return processLogin(iphone, LoginForTelAdapter.class);
    }


    private ResultMsg processLogin(String key, Class<? extends ILoginAdapter> clazz){
        try {
            ILoginAdapter iLoginAdapter = clazz.newInstance();
            if(iLoginAdapter.support(iLoginAdapter)){
                return iLoginAdapter.login(key,iLoginAdapter);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
