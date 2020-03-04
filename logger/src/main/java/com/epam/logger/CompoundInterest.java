package com.epam.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest {
	private static Logger LOGGER=LogManager.getLogger(CompoundInterest.class);
	
	 public double calculateCompoundInterest(double principle, double time, double rate) {
	        double amount = principle * (Math.pow((1 + rate / 100), time));
	        double compoundinterest = amount - principle;
	        LOGGER.info(compoundinterest);
	        return compoundinterest;
	    }
}
