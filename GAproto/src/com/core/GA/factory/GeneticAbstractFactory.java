package com.core.GA.factory;

import com.core.GA.GeneticAlgorithm;
/** 
 * abstact factory class to return the the genetic algorithm based on the client stategy.
 * @author 
 *
 */
public abstract class GeneticAbstractFactory {
	
   public abstract GeneticAlgorithm getMutationStrategy();
   
   public abstract GeneticAlgorithm getReproductionStrategy();
   
   public abstract GeneticAlgorithm getSelectionStrategy();
   
   public abstract GeneticAlgorithm getStrategy(String type);
	   
}
