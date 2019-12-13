package com.xg.adapter.loginadapter;

public class Member {

    private String userName;
    private String pass;
    private String mid;
    private String info;

    @Override
    public String toString() {
        return "Member{" +
                "userName='" + userName + '\'' +
                ", pass='" + pass + '\'' +
                ", mid='" + mid + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
