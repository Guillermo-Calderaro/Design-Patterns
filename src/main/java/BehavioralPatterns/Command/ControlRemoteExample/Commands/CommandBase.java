package BehavioralPatterns.Command.ControlRemoteExample.Commands;

public interface CommandBase {
    void execute();
    void undo();
}
