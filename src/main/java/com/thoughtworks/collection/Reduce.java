package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        List<Double> numbers = arrayList.stream().map(Double::valueOf).collect(Collectors.toList());
        return numbers.stream().reduce((numberA, numberB) -> numberA + numberB).map(total -> total / arrayList.size()).get().doubleValue();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(Integer::max).get().intValue();
    }

    public int getLastOdd() {
        return arrayList.stream().filter(number -> number % 2 == 1).reduce((numberA, numberB) -> numberB).get().intValue();
    }
}
