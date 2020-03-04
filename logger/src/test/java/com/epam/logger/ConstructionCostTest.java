package com.epam.logger;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ConstructionCostTest {
private ConstructionCost cost=new ConstructionCost();
private String material;
private int totalarea;
private double expectedResult;
public ConstructionCostTest(String material,int totalarea, double expectedResult) {
    this.material = material;
    this.totalarea=totalarea;
    this.expectedResult = expectedResult;
 }
@Parameterized.Parameters
public static Collection interestinputs() {
   return Arrays.asList(new Object[][] {
      {"standard", 130, 156000},
      { "above standard",130,195000 },
      { "high standard",130,234000 },
      {"high standard and automated",130 , 325000 },
    
     
   });
}

@Test
public void cost() {
	 assertEquals(expectedResult, cost.calculatingConstructionCost(material,totalarea),0);  
  
}
}
