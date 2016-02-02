package com.core.GA.factory;

import com.core.GA.GeneticAlgorithm;
import com.core.GA.strategy.MutationStrategy;
import com.core.GA.strategy.ReproductionStrategy;
import com.core.GA.strategy.SelectionStrategy;


public class GeneticConcreteFactory extends GeneticAbstractFactory{

	@Override
	public GeneticAlgorithm getMutationStrategy() {
		return MutationStrategy.getInstance();
	}

	@Override
	public GeneticAlgorithm getReproductionStrategy() {
		return ReproductionStrategy.getInstance();
	}

	@Override
	public GeneticAlgorithm getSelectionStrategy() {
		return SelectionStrategy.getInstance();
	}

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
