package com.xg.adapter.loginadapter.v2;

import com.xg.adapter.loginadapter.ResultMsg;
import com.xg.adapter.loginadapter.SiginService;

public class LogForQQAdapter extends SiginService implements ILoginAdapter{
    @Override
    public boolean support(Object obj) {
        return obj instanceof LogForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.login(id,"6666");
    }
}
