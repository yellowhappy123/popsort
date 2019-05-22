package popsort.designPatterns.strategy;

/**
 * Created by huangx on 2018/11/12.
 */
public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("silence");
    }
}
