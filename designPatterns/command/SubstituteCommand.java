package popsort.designPatterns.command;

/**
 * 保罗换下戈登命令
 * Created by huangx on 2018/11/22.
 */
public class SubstituteCommand implements Command {
    private Player upPlayer;
    private Player downPlay;

    public SubstituteCommand(Player up,Player down){
        this.upPlayer=up;
        this.downPlay=down;
    }

    public void execute() {
        upPlayer.up();
        downPlay.down();
    }

    public void undo() {
        downPlay.up();
        upPlayer.down();
    }
}
