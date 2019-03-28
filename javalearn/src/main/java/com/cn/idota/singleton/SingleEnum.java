package com.cn.idota.singleton;

/**
 * @Description: 枚举实现单例
 * @Author idota
 * @Date 2019/3/28
 */
public class SingleEnum {

    private SingleEnum() {
    }


    public static SingleEnum getInstance() {
        return Single.INSTANCE.getInstance();
    }

    private static enum Single {
        INSTANCE;
        private SingleEnum e;

        private Single() {
            e = new SingleEnum();
        }

        public SingleEnum getInstance() {
            return e;
        }

    }
}
