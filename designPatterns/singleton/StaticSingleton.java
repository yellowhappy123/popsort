package popsort.designPatterns.singleton;

/**
 * StaticSingleton
 * Created by huangx on 2019/6/23.
 */
//静态内部类实现 线程安全 延迟加载
public class StaticSingleton {
    private static StaticSingleton staticSingleton;

    private StaticSingleton() {

    }

    static class StaticInnerSingleton {
        static final StaticSingleton staticSingleton = new StaticSingleton();
    }

    public static StaticSingleton getStaticSingletonHold() {
        return StaticInnerSingleton.staticSingleton;
    }

}
