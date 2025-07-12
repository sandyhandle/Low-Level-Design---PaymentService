package org.example.BehaviouralPatterns.TemplateMethodPattern;

public class JsonParser extends DataParser{
    @Override
    protected void parseFile() {
        System.out.println("Json file is getting parsed.");
    }
}
