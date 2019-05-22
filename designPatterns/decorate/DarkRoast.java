package popsort.designPatterns.decorate;

/**
 * 这是具体的组件超优深焙咖啡
 * Created by huangx on 2018/11/15.
 */
public class DarkRoast extends Beverage {


    public String getDescription() {
        return " darkRoast ";
    }

    public int cost() {
        return 15;
    }
}
