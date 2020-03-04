package com.epam.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	private static Logger LOGGER= LogManager.getLogger(SimpleInterest.class);
	 public double calculateSimpleInterest(double principle, double time, double rate) {
	        double simpleinterest = (principle * time * rate)/100;
	        LOGGER.info(simpleinterest);
	        return simpleinterest;
	    }
}
