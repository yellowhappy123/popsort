package popsort.designPatterns.observer;

/**
 * Created by huangx on 2018/11/14.
 */
public class FishCitizen implements Observer {
    private String name;
    private int fish;
    private int height;
    private Subject subject;

    public FishCitizen(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.addObserver(this);//关键一步把自己扔到主题中去
    }

    public void update() {
        if (subject instanceof QiangtangRiverStation) {
            this.fish = ((QiangtangRiverStation) subject).getFish();
            this.height = ((QiangtangRiverStation) subject).getHeight();
        }
        display();
    }

    public void display() {
        System.out.println("我是" + name + ",今天的鱼量是" + fish + ",今天 的水位是" + height);
    }
}
