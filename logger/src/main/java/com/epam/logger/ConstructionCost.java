package com.epam.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {
	 public int totalcost;
	 private static Logger LOGGER = LogManager.getLogger(ConstructionCost.class);
     public double calculatingConstructionCost(String material,int totalarea) {
           if(material=="standard") {
        	   totalcost=1200*totalarea;
           }
           else if(material=="above standard")
           {
        	   totalcost=1500*totalarea;   
           }
           else if(material=="high standard")
           {
        	   totalcost=1800*totalarea;   
           }
           else if(material=="high standard and automated")
           {
        	   totalcost=2500*totalarea;   
           }
           LOGGER.info(totalcost);
           return totalcost;
    	 
     }
}
