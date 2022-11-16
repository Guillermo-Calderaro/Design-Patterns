package BehavioralPatterns.Command.EditorExample.Commands;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public boolean isEmpty(){
        return history.isEmpty();
    }

    public Command pop(){
        return history.pop();
    }

    public void push(Command command){
        history.push(command);
    }
}
