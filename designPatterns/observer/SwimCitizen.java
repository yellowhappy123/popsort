package popsort.designPatterns.observer;

/**
 * Created by huangx on 2018/11/14.
 */
public class SwimCitizen implements Observer {
    private String name;
    private int tempature;
    private int wind;
    private Subject subject;

    public SwimCitizen(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update() {
        if (subject instanceof QiangtangRiverStation) {
            this.tempature = ((QiangtangRiverStation) subject).getTempature();
            this.wind = ((QiangtangRiverStation) subject).getWind();
        }
        display();
    }

    public void display() {
        System.out.println("我是" + name + ",今天的温度是" + tempature + ",今天 的风力是" + wind);
    }
}
