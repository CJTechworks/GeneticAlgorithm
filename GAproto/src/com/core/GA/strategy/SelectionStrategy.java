package com.core.GA.strategy;

import com.core.GA.GeneticAlgorithm;
/**
 * this is the implementation class for selection stategy.
 * this class implements the genetic algorithm interface.
 * @author Shyam Ravichandran
 *
 */
public class SelectionStrategy implements GeneticAlgorithm {
	//singleton instance
	private static SelectionStrategy instance = new SelectionStrategy();
	
	/*
	 * private constructor
	 */
	private SelectionStrategy() {
		
	}
	/*
	 * singleton instance getter
	 */
	public static SelectionStrategy getInstance() {
		return instance;
	}
	/*
	  * implementation method of the genetic algorithm
	  * @see com.core.GA.GeneticAlgorithm#doGAProcess()
	  */
	@Override
	public void doGAProcess() {
		System.out
				.println("SELECTION : Selecting two parent chromosomes from a population according to their fitness...");

	}

}
