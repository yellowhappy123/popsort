package popsort.designPatterns.decorate;

/**
 * 具体的装饰者，即调料
 * Created by huangx on 2018/11/15.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() +"add mocha ";
    }

    public int cost() {
        return 7 + beverage.cost();
    }
}
