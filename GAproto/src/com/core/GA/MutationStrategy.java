package com.core.GA;

public class MutationStrategy implements GeneticAlgorithm {

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
