package popsort.designPatterns.command;

/**
 * Player 球员即 接收者
 * Created by huangx on 2018/11/22.
 */
public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + "正兴奋的上场");
    }

    public void down() {
        System.out.println(name + "正失望的下场");
    }

    public void attact() {
        System.out.println(name + "正血腥的进攻");
    }

    public void defend() {
        System.out.println(name + "正强悍的防守");
    }
}
