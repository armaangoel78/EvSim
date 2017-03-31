package main_package;

import neural_network.Network;;

public class Main {

	public static void main(String[] args) {
		int[] layout = new int[]{1, 2, 3, 1};
		double[] input = new double[]{1};
		
		double[][][] weights = new double[][][]
				{
					{
						{2},
						{2}
					},
					
					{
						{2, 2},
						{2, 2},
						{2, 2}
					},
					
					{
						{2, 2, 2},
					}
			
				};
		
		Network net = new Network(layout, weights, false);
		input = net.getOutput(input);
		
		for (double i : input) {
			System.out.println(i);
		}
	}

}
