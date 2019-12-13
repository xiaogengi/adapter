package com.xg.adapter.loginadapter.v2;

import com.xg.adapter.loginadapter.ResultMsg;

public interface IPassportForThird {

    ResultMsg loginForQQ(String id);

    ResultMsg loginForSina(String id);

    ResultMsg loginForTel(String iphone, String code);

}
