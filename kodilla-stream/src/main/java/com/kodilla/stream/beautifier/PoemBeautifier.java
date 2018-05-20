package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String a,  PoemDecorator dec) {
        String result = dec.decorate(a);
        System.out.println("Result equals: " + result);
    }
}
