package com.xg.adapter.loginadapter.v1;

public class SigninForThirdServiceTest {

    public static void main(String[] args) {
        System.out.println("QQ登陆 ：" + new SigninForThirdService().loginForQQ("123"));
        System.out.println("Token登陆 ：" + new SigninForThirdService().loginForToken(""));
    }

}
