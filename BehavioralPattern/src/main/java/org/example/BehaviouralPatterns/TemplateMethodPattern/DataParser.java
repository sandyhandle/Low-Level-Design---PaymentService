package org.example.BehaviouralPatterns.TemplateMethodPattern;

abstract class DataParser {

    public void parse(){
        openFile();
        parseFile();
        closeFile();
    }

    private void openFile(){
        System.out.println("Open File.");
    }

    protected abstract void parseFile();

    private void closeFile(){
        System.out.println("Close File.");
    }
}
