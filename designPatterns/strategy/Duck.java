package popsort.designPatterns.strategy;

/**
 * Created by huangx on 2018/11/12.
 */
public abstract class Duck {
  Flybehavior flybehavior;
  QuackBehavior quackBehavior;
  public Duck(){

  }

  public abstract void display();

  public void performFly() {
      flybehavior.fly();
  }

  public void performQuack(){
      quackBehavior.quack();
  }

  public void swim(){
      System.out.println("All duck can float");
  }
}
