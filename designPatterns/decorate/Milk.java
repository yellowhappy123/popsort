package popsort.designPatterns.decorate;

/**
 * 具体的装饰者，即调料
 * Created by huangx on 2018/11/15.
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + "add milk ";
    }

    public int cost() {
        return 5 + beverage.cost();
    }
}
