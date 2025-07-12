package org.example.BehaviouralPatterns.CommandPattern;

public class ChangeColorCommand implements Command{

    private TextEditor editor;


    public ChangeColorCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.changeColorText();
    }
}
