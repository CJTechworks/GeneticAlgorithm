package com.core.GA.factory;

import com.core.GA.GeneticAlgorithm;
import com.core.GA.strategy.MutationStrategy;
import com.core.GA.strategy.ReproductionStrategy;
import com.core.GA.strategy.SelectionStrategy;
/**
 * this class is the concrete factory class which returns the specific strategy requested 
 * by the client. 
 * @author Shyam Ravichandran
 *
 */
public class GeneticConcreteFactory extends GeneticAbstractFactory{
	/* get the mutation strategy */
	@Override
	public GeneticAlgorithm getMutationStrategy() {
		return MutationStrategy.getInstance();
	}
	
	/* get reproduction strategy*/
	@Override
	public GeneticAlgorithm getReproductionStrategy() {
		return ReproductionStrategy.getInstance();
	}
	
	/*get the selection strategy*/
	@Override
	public GeneticAlgorithm getSelectionStrategy() {
		return SelectionStrategy.getInstance();
	}
	
	 /* get the stategy it is the main method which decides which strategy to return based on the type*/
	@Override
	public GeneticAlgorithm getStrategy(String type) {

		if("Reproduction".equalsIgnoreCase(type)){
			return getReproductionStrategy();
		}
		else if("Mutation".equalsIgnoreCase(type)){
			return this.getMutationStrategy();
		}
		else if("Selection".equalsIgnoreCase(type)){
			return this.getSelectionStrategy();
		}
		return null;
	
	}

}
