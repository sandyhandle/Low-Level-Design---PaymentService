package org.example.BehaviouralPatterns.TemplateMethodPattern;

public class CSVParser extends DataParser{
    @Override
    protected void parseFile() {
        System.out.println("CSV file is getting parsed.");
    }
}
