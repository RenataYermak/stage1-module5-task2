package com.epam.mjc;

import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> x.stream().map(element -> element / divider).collect(Collectors.toList());
    }
}
