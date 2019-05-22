package popsort.designPatterns.strategy;

/**
 * Created by huangx on 2018/11/12.
 */
public class TestDuck {
    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
