package popsort.designPatterns.strategy;

/**
 * Created by huangx on 2018/11/12.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        super.flybehavior=new FlyWithWings();  //这是可飞的鸭子 给他设置会飞的属性
        super.quackBehavior=new Quack();  //这是能叫唤的鸭子 给他设置会叫的属性
    }

    public void display(){
        System.out.println("i am  a real Mallard duck");
    }
}
