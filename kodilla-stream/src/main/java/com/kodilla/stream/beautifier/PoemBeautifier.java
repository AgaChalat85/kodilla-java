package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String textTodecorate, PoemDecorator poemDecorator) {
        String textAfterBeautify = poemDecorator.decorate(textTodecorate);
        System.out.println("Text after beautify " + textAfterBeautify );
    }
}
