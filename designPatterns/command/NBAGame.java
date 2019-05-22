package popsort.designPatterns.command;

/**
 * nba西部总决赛
 * Created by huangx on 2018/11/22.
 */
public class NBAGame {
    public static void main(String[] args) {
        //德安东尼下命令让戈登换下保罗
        Player paul = new Player("gooden");
        Player gooden = new Player("paul");
        Command command = new SubstituteCommand(paul, gooden);
        Coach antoni = new Coach();
        antoni.setCommand(command);
        antoni.call();

        //德安东尼见势不对,撤销了刚下的命令，让保罗回来
        antoni.undo();

        //德安东尼让哈登趁热打铁，努力进攻
        Player harder = new Player("harder");
        Command harderattactCommand = new AttackCommand(harder);
        antoni.setCommand(harderattactCommand);
        antoni.call();


    }
}
