package org.example.BehaviouralPatterns.CommandPattern;

import java.sql.SQLOutput;

public class TextEditor {

    public void boldText() {
        System.out.println("Text has been Bolded.");
    }

    public void italicizeText() {
        System.out.println("Text has been Italicized.");
    }

    public void underlineText() {
        System.out.println("Text has been Underlined.");
    }

    public void changeColorText() {
        System.out.println("Text has been Changed Color.");
    }
}
