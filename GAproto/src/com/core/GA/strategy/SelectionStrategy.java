package com.core.GA.strategy;

import com.core.GA.GeneticAlgorithm;
import com.core.utilility.Individual;
import com.core.utilility.Population;
/**
 * this is the implementation class for selection stategy.
 * this class implements the genetic algorithm interface.
 * @author Shyam Ravichandran
 *
 */
public class SelectionStrategy implements GeneticAlgorithm {
	//singleton instance
	private static SelectionStrategy instance = new SelectionStrategy();
	
	 private static final double uniformRate = 0.5;
	    private static final double mutationRate = 0.015;
	    private static final int tournamentSize = 5;
	    private static final boolean elitism = true;

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
		System.out.println("SELECTION ...");

	}

	 // Select individuals for crossover
    public static Individual tournamentSelection(Population pop) {
        // Create a tournament population
        Population tournament = new Population(tournamentSize, false);
        // For each place in the tournament get a random individual
        for (int i = 0; i < tournamentSize; i++) {
            int randomId = (int) (Math.random() * pop.size());
            tournament.saveIndividual(i, pop.getIndividual(randomId));
        }
        // Get the fittest
        Individual fittest = tournament.getFittest();
        return fittest;
    }
}
