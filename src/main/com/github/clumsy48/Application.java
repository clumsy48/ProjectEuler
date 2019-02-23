package com.github.clumsy48;

import com.github.clumsy48.solutions.Two;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Application {
    static Logger logger = Logger.getLogger(Application.class.getName());
    public static void main(String[] args){
        BasicConfigurator.configure();
        Two two = new Two();
        logger.debug(two.calculateSumEvenInFibonacci());
    }
}
