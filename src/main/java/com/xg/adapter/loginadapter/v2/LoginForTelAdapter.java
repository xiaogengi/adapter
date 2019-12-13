package com.xg.adapter.loginadapter.v2;

import com.xg.adapter.loginadapter.ResultMsg;

public class LoginForTelAdapter implements ILoginAdapter {
    @Override
    public boolean support(Object obj) {
        return obj instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
