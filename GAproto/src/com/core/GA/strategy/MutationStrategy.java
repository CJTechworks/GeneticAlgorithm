package com.core.GA.strategy;

import com.core.GA.GeneticAlgorithm;

/**
 * This class is the strategy class implementation for mutation strategy. 
 * this class implements the genetic algorithm interface.
 * @author Shyam Ravichandran
 *
 */
public class MutationStrategy implements GeneticAlgorithm {
	
	// static instance for each stragegy. this ensures that it is singleton class and 
	// only one object exist

	private static MutationStrategy instance = new MutationStrategy();
	
	// private constructor so that the client can't initialize it.
	private MutationStrategy() {
		
	}
	/*
	 * singleton get instance method
	 */
	public static MutationStrategy getInstance() {
		return instance;
	}
	/*
	 * implementation method of the genetic algorithm
	 * @see com.core.GA.GeneticAlgorithm#doGAProcess()
	 */
	@Override
	public void doGAProcess() {
		System.out.println("MUTATION: mutating new offspring at each locus...");
	}

}
