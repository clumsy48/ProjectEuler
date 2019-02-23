package com.github.clumsy48.solutions;

import java.util.stream.IntStream;

public class One {

    public int calculateSumMultiplesOf3Or5() {
        return IntStream.range(1, 1000).filter(this::multipleOfOnly3And5).sum();
    }

    private boolean multipleOfOnly3And5(int number) {
        return  number % 3 == 0 || number % 5 == 0;
    }
}
