package popsort.designPatterns.singleton;

/**
 * HungrySingleton
 * Created by huangx on 2019/6/23.
 */
//饿汉 线程安全 一开始便初始化 浪费资源
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
