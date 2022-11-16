package BehavioralPatterns.Command.EditorExample.Commands;

import BehavioralPatterns.Command.EditorExample.Editor.Editor;

public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
