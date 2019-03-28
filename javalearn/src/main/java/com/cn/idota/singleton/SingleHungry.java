package com.cn.idota.singleton;

/**
 * @Description: 饿汉模式
 * @Author idota
 * @Date 2019/3/27
 */
public class SingleHungry {

    private static SingleHungry  s  = new SingleHungry();


    private SingleHungry(){}


    public static SingleHungry getInstance(){
        return s;
    }


}
