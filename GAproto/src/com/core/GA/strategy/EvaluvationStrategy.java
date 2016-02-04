package com.core.GA.strategy;

import com.core.GA.GeneticAlgorithm;
import com.core.GA.factory.GeneticAbstractFactory;
import com.core.GA.factory.GeneticConcreteFactory;
import com.core.utilility.Individual;
import com.core.utilility.Population;

/**
 * This class is the strategy class implementation for mutation strategy. 
 * this class implements the genetic algorithm interface.
 * @author Shyam Ravichandran
 *
 */
public class EvaluvationStrategy implements GeneticAlgorithm {
	private static final double uniformRate = 0.5;
    private static final double mutationRate = 0.015;
    private static final int tournamentSize = 5;
    private static final boolean elitism = true;
	
	// static instance for each stragegy. this ensures that it is singleton class and 
	// only one object exist

	private static EvaluvationStrategy instance = new EvaluvationStrategy();
	
	// private constructor so that the client can't initialize it.
	private EvaluvationStrategy() {
		
	}
	/*
	 * singleton get instance method
	 */
	public static EvaluvationStrategy getInstance() {
		return instance;
	}
	/*
	 * implementation method of the genetic algorithm
	 * @see com.core.GA.GeneticAlgorithm#doGAProcess()
	 */
	@Override
	public void doGAProcess() {
		System.out.println("EVALUVATION...");
		
	}
	public static Population evolvePopulation(Population pop) {
        Population newPopulation = new Population(pop.size(), false);

        // Keep our best individual
        if (elitism) {
            newPopulation.saveIndividual(0, pop.getFittest());
        }

        // Crossover population
        int elitismOffset;
        if (elitism) {
            elitismOffset = 1;
        } else {
            elitismOffset = 0;
        }
        // Loop over the population size and create new individuals with
        // crossover
        GeneticAbstractFactory geneticAbstractFactory = new GeneticConcreteFactory();
        geneticAbstractFactory.getStrategy("Selection").doGAProcess();
        geneticAbstractFactory.getStrategy("CrossOver").doGAProcess();
        for (int i = elitismOffset; i < pop.size(); i++) {
            Individual indiv1 = SelectionStrategy.getInstance().tournamentSelection(pop);
            Individual indiv2 =  SelectionStrategy.getInstance().tournamentSelection(pop);
            Individual newIndiv = CrossOverStrategy.getInstance().crossover(indiv1, indiv2);
            newPopulation.saveIndividual(i, newIndiv);
        }
        geneticAbstractFactory.getStrategy("Mutation").doGAProcess();
        // Mutate population
        for (int i = elitismOffset; i < newPopulation.size(); i++) {
            MutationStrategy.getInstance().mutate(newPopulation.getIndividual(i));
        }

        return newPopulation;
    }

}
