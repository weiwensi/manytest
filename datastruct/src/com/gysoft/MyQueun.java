package com.gysoft;


import java.util.AbstractQueue;
import java.util.Iterator;

/**
 * @Description
 * @Author DJZ-WWS
 * @Date 2019/1/18 9:26
 */
public class MyQueun   extends AbstractQueue {



    public Iterator iterator(){
        return null;
    }

    @Override
    public int size() {
        return 0;
    }


    public static void main(String[] args) {


        System.out.println(11000*13-2200*10-2000*12-1500*12);
        MyQueun myQueun = new MyQueun();
        //入队
        myQueun.add("a");
        myQueun.add("b");
        myQueun.add("c");
        myQueun.add("d");
        myQueun.add("e");
        myQueun.add("F");

        System.out.println("入队后结果"+myQueun.size());
        //出队

        myQueun.poll();
        System.out.println("出队后结果"+myQueun.size());

    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }



}
