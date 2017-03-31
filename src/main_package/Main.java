package main_package;

import neural_network.Network;;

public class Main {

	public static void main(String[] args) {
		int[] layout = new int[]{1, 2, 3, 1};
		double[] input = new double[]{1};
		Network net = new Network(layout);
		input = net.getOutput(input);
		
		for (double i : input) {
			System.out.println(i);
		}
	}

}
