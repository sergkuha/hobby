package com.kuha.sergey;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    final static Logger logger = LogManager.getLogger(Test.class);
    public static void main(String[] args) {
        logger.info("Application start.");
        Test test = new Test();
        test.logMethod("param");
        logger.info("Exiting application.");
    }

    public void logMethod(String parameter){
        if(logger.isDebugEnabled())
            logger.debug("Debug mode: " + parameter);

        if(logger.isInfoEnabled())
            logger.info("Info mode: " + parameter);

        logger.error("Error mode: " + parameter);

        try {
            Hobby eatSweets = new Hobby();
            eatSweets.tellAboutHobby();

            Hobby petTheCat = new Hobby((byte) 3, 'c', true);
            petTheCat.tellAboutHobby();

            Hobby dragDealing = new Hobby((byte) 1, (short) 30, 300, 5L, 'd', 20000, 500, true);
            dragDealing.tellAboutHobby();

            Hobby photography = new Hobby((byte) 2, (short) 60, 100/0, 2L, 'p', 500, 1000, true);
            photography.tellAboutHobby();
        }catch (Exception ex) {
            logger.error("Here exception: " , ex);
        }
    }
}
