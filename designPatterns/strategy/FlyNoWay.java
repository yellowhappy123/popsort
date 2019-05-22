package popsort.designPatterns.strategy;

/**
 * Created by huangx on 2018/11/12.
 */
public class FlyNoWay implements Flybehavior{

    public void fly() {
        System.out.println("i cant fly");
    }
}
