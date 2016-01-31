package com.core.GA.test;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.core.GA.GeneticAlgorithm;
import com.core.GA.factory.GeneticAbstractFactory;
import com.core.GA.factory.GeneticConcreteFactory;

public class TestGeneticAlgorithn {

	public static void main(String [] args){
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				
				@Override
				public void run() {
				
					String num =   JOptionPane.showInputDialog(null,"Enter Number of Generation");
					
					for (int i =1;i<=Integer.parseInt(num);i++){
					System.out.println("GENERATION: "+i );
					String [] arr = {"Reproduction", "Mutation", "Selection"};
					Random random = new Random();
					int select = random.nextInt(arr.length);
					GeneticAbstractFactory geneticAbstractFactory = new GeneticConcreteFactory();
					GeneticAlgorithm geneticAlgorithm = geneticAbstractFactory.getStrategy(arr[select]);
					geneticAlgorithm.doGAProcess();
						System.out.println("\n-----------" );
					}
				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
