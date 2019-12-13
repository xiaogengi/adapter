package com.xg.adapter.loginadapter;

public class SiginService {

    public ResultMsg regist(String userName,String pass){
        return new ResultMsg(200,"注册成功！", new Member());
    }


    public ResultMsg login(String userName, String pass){
        if("id".equals(userName)){
            return new ResultMsg(500,"not login error",null);
        }
        return new ResultMsg(200, "登陆成功",new Member());
    }


}
