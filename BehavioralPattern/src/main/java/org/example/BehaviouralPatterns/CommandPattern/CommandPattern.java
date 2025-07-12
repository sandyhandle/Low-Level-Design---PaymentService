package org.example.BehaviouralPatterns.CommandPattern;

import org.w3c.dom.Text;

public class CommandPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        Button button= new Button();
        button.setCommand(new BoldCommand(editor));
        button.setCommand(new ChangeColorCommand(editor));

        button.click();


    }
}
