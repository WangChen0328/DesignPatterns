package Command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author wangchen
 * @date 2018/5/28 10:21
 */
public class MacroCommand implements Command {

    /**
     * 命令的集合
     */
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            iterator.next().execute();
        }
    }

    public void append(Command command) {
        if (command != this) {
            commands.push(command);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
