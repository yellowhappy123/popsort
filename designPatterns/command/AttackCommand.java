package popsort.designPatterns.command;

/**
 * AttackCommand 进攻命令
 * Created by huangx on 2018/11/23.
 */
public class AttackCommand implements Command {
    private Player attackPlayer;

    public AttackCommand(Player attackPlayer) {
        this.attackPlayer = attackPlayer;
    }

    public void execute() {
        attackPlayer.attact();
    }

    public void undo() {
        attackPlayer.defend();
    }
}
