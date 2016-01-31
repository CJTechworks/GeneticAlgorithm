package com.core.GA;

import java.util.HashMap;
import java.util.Map;

public class GeneticFactory {
	 private static Map <String,GeneticAlgorithm> geneticMap =
             new HashMap(); 

	 static {
		 geneticMap.put("Reproduction",
                  ReproductionStrategy.getInstance());
		 
		 geneticMap.put("Mutation",
                   MutationStrategy.getInstance());
		 
		 geneticMap.put("Selection",
                  SelectionStrategy.getInstance());
   }
	 
   public static GeneticAlgorithm getInstance(String type) {
         return geneticMap.get(type);
   }
}
