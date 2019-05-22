package popsort.designPatterns.observer;

/**
 * Created by huangx on 2018/11/14.
 */
public class TestApplication {
    public static void main(String[] args) {
        QiangtangRiverStation qiangtangRiverStation=new QiangtangRiverStation();
        SwimCitizen swimCitizen=new SwimCitizen("刘叔叔",qiangtangRiverStation);
        FishCitizen fishCitizen=new FishCitizen("王大伯",qiangtangRiverStation);
        PhotoCitizen photoCitizen=new PhotoCitizen("王阿姨",qiangtangRiverStation);
        qiangtangRiverStation.setNewInfo(11,22,33,44);
        qiangtangRiverStation.setNewInfo(55,66,77,88);
    }
}
