package com.core.GA.factory;

import com.core.GA.GeneticAlgorithm;
/** 
 * abstact factory class to return the the genetic algorithm based on the client stategy.
 * @author Shyam Ravichandran
 *
 */
public abstract class GeneticAbstractFactory {
	/* get the mutation strategy */
   public abstract GeneticAlgorithm getMutationStrategy();
   
   /* get reproduction strategy*/
   public abstract GeneticAlgorithm getReproductionStrategy();
   
   /*get the selection strategy*/
   public abstract GeneticAlgorithm getSelectionStrategy();
   
   /* get the stategy it is the main method which decides which strategy to return based on the type*/
   public abstract GeneticAlgorithm getStrategy(String type);
	   
}
