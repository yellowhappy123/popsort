package popsort.designPatterns.singleton;

/**
 * LazySingleton
 * Created by huangx on 2019/6/23.
 */
//懒汉 双重锁校验
public class LazySingleton {
    private static volatile LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton=new LazySingleton();
                    return lazySingleton;
                }
            }
        }
        return lazySingleton;
    }
}
