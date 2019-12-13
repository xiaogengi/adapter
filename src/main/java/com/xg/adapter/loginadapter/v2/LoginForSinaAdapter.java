package com.xg.adapter.loginadapter.v2;

import com.xg.adapter.loginadapter.ResultMsg;

public class LoginForSinaAdapter implements ILoginAdapter {
    @Override
    public boolean support(Object obj) {
        return obj instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
