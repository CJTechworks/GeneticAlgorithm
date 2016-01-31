package com.core.GA;

public class SelectionStrategy implements GeneticAlgorithm {

	private static SelectionStrategy instance = new SelectionStrategy();

	private SelectionStrategy() {
		
	}

	public static SelectionStrategy getInstance() {
		return instance;
	}

	@Override
	public void doGAProcess() {
		System.out
				.println("SELECTION : Selecting two parent chromosomes from a population according to their fitness...");

	}

}
