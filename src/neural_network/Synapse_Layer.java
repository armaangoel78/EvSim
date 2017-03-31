package neural_network;

public class Synapse_Layer {
	public Synapse[][] synapses;
	public int num;
	
	public Synapse_Layer (int a, int b, int num) {
		this.num = num;
		
		synapses = new Synapse[a][b];

		for (int i = 0; i < a; i++) { 
			for (int x = 0; x < b; x++) {
				synapses[i][x] = new Synapse();
			}
		}
	}
	
	public double[] push(Network network) {
		for (int i = 0; i < synapses.length; i++) {
			for (int x = 0; x < synapses[i].length; x++) {
				synapses[i][x].getOutput(network.neurons[num].neurons[i]);
			}
		}
		
		return network.neurons[num+1].push(network);
	}
}
