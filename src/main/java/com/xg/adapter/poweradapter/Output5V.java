package com.xg.adapter.poweradapter;

public class Output5V {

    private Input220V input220V;

    public Output5V(Input220V input220V){
        this.input220V = input220V;
    }


    public int outPut5V(){
        int i = input220V.input220V();
        int i1 = i / 44;
        System.out.println("输入电流：" + i + " && 输出电流：" + i1);
        return i1;
    }

}
