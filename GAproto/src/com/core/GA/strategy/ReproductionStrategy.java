package com.core.GA.strategy;

import com.core.GA.GeneticAlgorithm;

public class ReproductionStrategy implements GeneticAlgorithm {

	private static ReproductionStrategy instance = new ReproductionStrategy();
	
	private  ReproductionStrategy() {
		
	}
	
	 public static ReproductionStrategy getInstance(){
	      return instance;
	   }
	 
	@Override
	public void doGAProcess() {
		System.out.println("REPRODUCTION: Placing new offspring in a new population...");

	}

}
