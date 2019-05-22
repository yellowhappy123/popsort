package popsort.designPatterns.decorate;

/**
 * 这是调料装饰者，继承与Beverage
 * Created by huangx on 2018/11/15.
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

    public abstract int cost();
}
