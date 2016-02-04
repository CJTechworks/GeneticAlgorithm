package com.core.GA.test;

import com.core.GA.factory.GeneticAbstractFactory;
import com.core.GA.factory.GeneticConcreteFactory;
import com.core.GA.strategy.EvaluvationStrategy;
import com.core.utilility.FitnessCalc;
import com.core.utilility.Population;

public class TestGeneticAlgorithn {

    public static void main(String[] args) {

        // Set a candidate solution
        FitnessCalc.setSolution("1111000000000000000000000000000000000000000000000000000000001111");
        GeneticAbstractFactory geneticAbstractFactory = new GeneticConcreteFactory();
        // Create an initial population
        Population myPop = new Population(50, true);
        
        // Evolve our population until we reach an optimum solution
        int generationCount = 0;
        while (myPop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
            generationCount++;
            System.out.println("Generation: " + generationCount + " Fittest: " + myPop.getFittest().getFitness());
            geneticAbstractFactory.getStrategy("Evaluvation").doGAProcess();
            myPop = EvaluvationStrategy.evolvePopulation(myPop);
        }
        System.out.println("Solution found!");
        System.out.println("Generation: " + generationCount);
        System.out.println("Genes:");
        System.out.println(myPop.getFittest());

    }
}
