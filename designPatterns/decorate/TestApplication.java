package popsort.designPatterns.decorate;

/**
 * TestApplication
 * Created by huangx on 2018/11/15.
 */
public class TestApplication {
    public static void main(String[] args) {
        Beverage beverage = new Milk(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(beverage.getDescription() + "--------- 需要支付" + beverage.cost());
    }
}
