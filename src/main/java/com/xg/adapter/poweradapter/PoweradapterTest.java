package com.xg.adapter.poweradapter;

public class PoweradapterTest {


    public static void main(String[] args) {
        Output5V output5V = new Output5V(new Input220V());
        output5V.outPut5V();
    }

}
