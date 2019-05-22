package popsort.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangx on 2018/11/14.
 */
public class QiangtangRiverStation implements Subject {

    private int height;
    private int tempature;
    private int wind;
    private int fish;
    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public void setNewInfo(int height, int tempature, int wind, int fish) {
        this.height = height;
        this.tempature = tempature;
        this.wind = wind;
        this.fish = fish;
        notifyObserver();
    }

    public int getHeight() {
        return height;
    }

    public int getTempature() {
        return tempature;
    }

    public int getWind() {
        return wind;
    }

    public int getFish() {
        return fish;
    }

}
