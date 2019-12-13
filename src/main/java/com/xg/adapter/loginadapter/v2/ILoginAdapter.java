package com.xg.adapter.loginadapter.v2;

import com.xg.adapter.loginadapter.ResultMsg;

public interface ILoginAdapter {

    boolean support(Object obj);
    ResultMsg login(String id, Object adapter);

}
