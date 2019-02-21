package com.github.clumsy48;

import com.github.clumsy48.solutions.One;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Application {
    static Logger logger = Logger.getLogger(Application.class.getName());
    public static void main(String[] args){
        BasicConfigurator.configure();
        One one = new One();
        logger.debug(one.calculateMultiplesOf3Or5());
    }
}
