package popsort.designPatterns.singleton;

/**
 * SingletonTest
 * Created by huangx on 2019/6/23.
 */
public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final Thread thread = new Thread(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName()+", HungrySingleton:"+ HungrySingleton.getHungrySingleton().hashCode());
                    System.out.println(Thread.currentThread().getName()+", LazySingleton:"+ LazySingleton.getLazySingleton().hashCode());
                    System.out.println(Thread.currentThread().getName()+", StaticSingleton:"+ StaticSingleton.getStaticSingletonHold().hashCode());
                }
            });
            thread.setName("" + i);
            thread.start();

        }
    }
}
