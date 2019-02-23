package com.github.clumsy48.solutions;

import org.apache.log4j.Logger;

public class Two {
    static Logger logger = Logger.getLogger(Two.class.getName());
    private static final int MILLION = 1000000;
    private static final int MULTIPLIER = 4;
    private int firstTerm = 1;
    private int secondTerm = 1;

    public int calculateSumEvenInFibonacci() {
        //return method1();
       // return method2();
        return method3();

    }

    private int method1() {
        int sum = 0;
        while (secondTerm <= MILLION * MULTIPLIER) {
            int temp = secondTerm;
            secondTerm = getNextTerm();
            firstTerm = temp;
            if (secondTerm % 2 == 0) sum += secondTerm;
        }
        return sum;
    }
    private int getNextTerm() {
        return firstTerm + secondTerm;
    }

    private int method2() {
        int sum = 0;
        int thirdTerm = firstTerm + secondTerm;
        while (thirdTerm < MILLION * MULTIPLIER) {
            sum += thirdTerm;
            firstTerm = secondTerm + thirdTerm;
            secondTerm = firstTerm + thirdTerm;
            thirdTerm = firstTerm + secondTerm;
        }
        return sum;
    }
    private int method3() {

        int localFirstTerm = 2;
        int localSecondTerm = 8;
        int sum = 2;
        while (localSecondTerm < MILLION * MULTIPLIER) {
            sum += localSecondTerm;
            int temp = localSecondTerm;
            localSecondTerm = 4 * localSecondTerm + localFirstTerm;
            localFirstTerm = temp;
         //   logger.debug(localSecondTerm);
        }
        return sum;
    }
}
