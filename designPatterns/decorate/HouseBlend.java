package popsort.designPatterns.decorate;

/**
 * 这是具体组件 中优深焙咖啡
 * Created by huangx on 2018/11/15.
 */
public class HouseBlend extends Beverage {

    public String getDescription() {
        return "i am houseBlend  ";
    }

    public int cost() {
        return 12;
    }
}
