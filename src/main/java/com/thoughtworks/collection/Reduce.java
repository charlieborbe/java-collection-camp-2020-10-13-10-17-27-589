package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream().reduce((total, currentValue) -> total + currentValue).orElse(0) / arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(Integer::max).get().intValue();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }
}
