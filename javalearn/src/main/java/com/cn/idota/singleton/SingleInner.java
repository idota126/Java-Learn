package com.cn.idota.singleton;

/**
 * @Description: 静态内部类
 * @Author idota 内加载机制保证了 线程安全
 * @Date 2019/3/27
 */
public class SingleInner {


    private static class Inner{
        public static SingleInner instance = new SingleInner();
    }

    public static SingleInner getInstance(){
        return Inner.instance;
    }


}
