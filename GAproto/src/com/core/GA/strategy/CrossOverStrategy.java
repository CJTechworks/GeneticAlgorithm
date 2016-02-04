package com.core.GA.strategy;

import com.core.GA.GeneticAlgorithm;
import com.core.utilility.Individual;

/**
 * This class is the strategy class implementation for mutation strategy. 
 * this class implements the genetic algorithm interface.
 * @author Shyam Ravichandran
 *
 */
public class CrossOverStrategy implements GeneticAlgorithm {
	private static final double uniformRate = 0.5;
    private static final double mutationRate = 0.015;
    private static final int tournamentSize = 5;
    private static final boolean elitism = true;
    
	// static instance for each stragegy. this ensures that it is singleton class and 
	// only one object exist

	private static CrossOverStrategy instance = new CrossOverStrategy();
	
	// private constructor so that the client can't initialize it.
	private CrossOverStrategy() {
		
	}
	/*
	 * singleton get instance method
	 */
	public static CrossOverStrategy getInstance() {
		return instance;
	}
	/*
	 * implementation method of the genetic algorithm
	 * @see com.core.GA.GeneticAlgorithm#doGAProcess()
	 */
	@Override
	public void doGAProcess() {
		System.out.println("CROSSOVER...");
	}

	public static Individual crossover(Individual indiv1, Individual indiv2) {
        Individual newSol = new Individual();
        // Loop through genes
        for (int i = 0; i < indiv1.size(); i++) {
            // Crossover
            if (Math.random() <= uniformRate) {
                newSol.setGene(i, indiv1.getGene(i));
            } else {
                newSol.setGene(i, indiv2.getGene(i));
            }
        }
        return newSol;
    }
}
