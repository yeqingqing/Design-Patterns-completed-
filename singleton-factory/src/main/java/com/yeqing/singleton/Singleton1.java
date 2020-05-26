package com.yeqing.singleton;

/**
 * 处理多线程
 * 第一种方式：同步 （即通俗的懒汉式，线程安全）
 *
 *这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
public class Singleton1 {
    private static Singleton1 uniqueInstance;

    private static synchronized Singleton1 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton1();
        }
        return  uniqueInstance;
    }
}

/**
 * PS:用static的原因：
 * 1.instance需要在调用getInstance时候被初始化，
 * 只有static的成员才能在没有创建对象时进行初始化。
 * 且类的静态成员在类第一次被使用时初始化后就不会再被初始化，保证了单例。
 * 2.static类型的instance存在静态存储区，每次调用时，都指向的同一个对象。
 */
