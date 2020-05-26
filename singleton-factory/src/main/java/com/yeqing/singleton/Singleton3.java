package com.yeqing.singleton;

/**
 * 双重锁制
 * 实现难度：较复杂
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class Singleton3 {
    /**
     *  volatile关键字确保：当uniqueInstance实例被初始化为Singleton实例时，
     *  多个线程正确的处理uniqueInstance变量
     */
    private  volatile  static Singleton3 uniqueInstance;

    public static Singleton3 getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton3.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return  uniqueInstance;
    }
}
