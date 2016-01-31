package com.core.GA.strategy;

import com.core.GA.GeneticAlgorithm;

public class MutationStrategy implements GeneticAlgorithm {
	
	// static instance for each stragegy. this ensures that it is singleton class and 
	// only one object exist

	private static MutationStrategy instance = new MutationStrategy();

	private MutationStrategy() {
		
	}

	public static MutationStrategy getInstance() {
		return instance;
	}

	@Override
	public void doGAProcess() {
		System.out.println("MUTATION: mutating new offspring at each locus...");
	}

}
