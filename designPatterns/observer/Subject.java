package popsort.designPatterns.observer;

/**
 * Created by huangx on 2018/11/14.
 */
public interface Subject {
     void addObserver(Observer observer);
     void deleteObserver(Observer observer);
     void notifyObserver();
}
