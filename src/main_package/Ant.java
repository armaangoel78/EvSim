package main_package;

import neural_network.Network;

public class Ant {
	public Network brain;
	
	public Ant() {
		int[] layout = new int[]{5, 5, 5};
		
		String s = "";
		for (int i = 0; i < (layout[0]*layout[1] + layout[1]*layout[2]) * 64; i++) {
			s += Math.random() > .5 ? "1" : "0";
		}
		
		brain = new Network(layout, s, true);		
	}
	
	
}
