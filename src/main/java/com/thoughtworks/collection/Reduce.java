package com.thoughtworks.collection;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        double average = arrayList.stream().mapToInt(number -> number).average().getAsDouble();
//        double average2 = arrayList.stream().reduce((total, currentValue) -> total + currentValue).orElse(0) / arrayList.size();
        return average;
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(Integer::max).get().intValue();
    }

    public int getLastOdd() {
        return arrayList.stream().filter(number -> number % 2 == 1).reduce((a, b) -> b).get().intValue();
    }
}
