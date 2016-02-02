package com.core.GA.strategy;

import com.core.GA.GeneticAlgorithm;
/**
 * this is the implementation class for reproduction stategy.
 * his class implements the genetic algorithm interface.
 * @author Shyam Ravichandran
 *
 */
public class ReproductionStrategy implements GeneticAlgorithm {
	//singleton instance
	private static ReproductionStrategy instance = new ReproductionStrategy();
	/*
	 * private constructor
	 */
	private  ReproductionStrategy() {
		
	}
	/*
	 * singleton instance getter
	 */
	 public static ReproductionStrategy getInstance(){
	      return instance;
	   }
	 /*
	  * implementation method of the genetic algorithm
	  * @see com.core.GA.GeneticAlgorithm#doGAProcess()
	  */
	@Override
	public void doGAProcess() {
		System.out.println("REPRODUCTION: Placing new offspring in a new population...");

	}

}
