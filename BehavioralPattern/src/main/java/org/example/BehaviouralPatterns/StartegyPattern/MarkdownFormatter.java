package org.example.BehaviouralPatterns.StartegyPattern;

public class MarkdownFormatter implements TextFormatter {

    @Override
    public String format(String text) {
        // TODO: Wrap the input text in Markdown syntax: "**" and "**".
        return "**" +text+"**";
    }
}
