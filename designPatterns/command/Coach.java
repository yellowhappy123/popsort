package popsort.designPatterns.command;

/**
 * Coach就是调用者Invoke
 * Created by huangx on 2018/11/22.
 */
public class Coach {
    private Command command;  //如果是宏命令可将该Command设置成list

    //设值注入
    public void setCommand(Command command) {
        this.command = command;
    }

    //业务方法，用于调用命令类的execute()方法
    public void call() {
        command.execute();
    }

    //撤销命令
    public void undo() {
        command.undo();
    }

}
