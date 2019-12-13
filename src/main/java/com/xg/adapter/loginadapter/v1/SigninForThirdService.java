package com.xg.adapter.loginadapter.v1;

import com.xg.adapter.loginadapter.Member;
import com.xg.adapter.loginadapter.ResultMsg;
import com.xg.adapter.loginadapter.SiginService;

public class SigninForThirdService extends SiginService {



    public ResultMsg loginForQQ(String openId){
        System.out.println("默认密码：6666");
        return loginForregist(openId,"6666");
    }


    public ResultMsg loginForToken(String token){
        if(token == null || "".equals(token)){
            return  new ResultMsg(500,"登陆失败，token错误！！", new Member());
        }
        return super.login("","");
    }


    public ResultMsg loginForregist(String userName, String pass){
        ResultMsg regist = super.regist(userName, pass);
        return super.login(userName,pass);
    }

}
