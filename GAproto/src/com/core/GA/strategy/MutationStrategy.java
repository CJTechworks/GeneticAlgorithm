package com.core.GA.strategy;

import com.core.GA.GeneticAlgorithm;
import com.core.utilility.Individual;

/**
 * This class is the strategy class implementation for mutation strategy. 
 * this class implements the genetic algorithm interface.
 * @author Shyam Ravichandran
 *
 */
public class MutationStrategy implements GeneticAlgorithm {
	private static final double uniformRate = 0.5;
    private static final double mutationRate = 0.015;
    private static final int tournamentSize = 5;
    private static final boolean elitism = true;
    
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
		System.out.println("MUTATION...");
	}

	 // Mutate an individual
    public static void mutate(Individual indiv) {
        // Loop through genes
        for (int i = 0; i < indiv.size(); i++) {
            if (Math.random() <= mutationRate) {
                // Create random gene
                byte gene = (byte) Math.round(Math.random());
                indiv.setGene(i, gene);
            }
        }
    }
}
