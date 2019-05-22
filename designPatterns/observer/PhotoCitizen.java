package popsort.designPatterns.observer;

/**
 * Created by huangx on 2018/11/14.
 */
public class PhotoCitizen implements Observer {
    private String name;
    private int wind;
    private Subject subject;

    public PhotoCitizen(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update() {
        if (subject instanceof QiangtangRiverStation) {
            this.wind = ((QiangtangRiverStation) subject).getWind();
        }
        display();
    }

    public void display() {
        System.out.println("我是" + name + ",今天的风力是" + wind + "今天的我一定是个小公举");
    }
}
