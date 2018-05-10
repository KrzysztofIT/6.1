package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        if (numbers != null) {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    tmp.add(number);
                }
            }
        }
        return tmp ;
    }
}
