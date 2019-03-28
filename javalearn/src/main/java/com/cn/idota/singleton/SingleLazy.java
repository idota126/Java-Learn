package com.cn.idota.singleton;

/**
 * @Description: 单例懒汉模式
 * @Author idota
 * @Date 2019/3/27
 */
public class SingleLazy {


    //volatile 关键字 保证尽量少的并发线程进入（被锁的代码块内）第二个循环内 可以在锁结束前能看见主内存的s是否为空
    private static volatile SingleLazy s;

    //私有化构造方法
    private SingleLazy(){}

    public static SingleLazy getInstence() {
        if (s == null) {
            //多线程状态下 如果不加锁 会有很多线程同时进来 创建多个single实例
            synchronized (SingleLazy.class) {
                //当另一个线程已经获取锁时候 s 已经实例化了 不判断的话 会再创建一个实例
                if (s == null) {
                    s = new SingleLazy();

                }
            }
        }
        return s;

    }
}
