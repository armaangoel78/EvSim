package neural_network;

public class Network {
	
	public Neuron_Layer[] neurons;
	public Synapse_Layer[] synapses;
	
	public Network(int[] layout) {
		neurons = new Neuron_Layer[layout.length];
		synapses = new Synapse_Layer[layout.length-1];
		
		for (int i = 0; i < neurons.length-1; i++) {
			neurons[i] = new Neuron_Layer(layout[i], i);
			synapses[i] = new Synapse_Layer(layout[i], layout[i+1], i);
		}
		neurons[layout.length-1] = new Neuron_Layer(layout[layout.length-1], layout.length-1);
	}
	
	public double[] getOutput(double[] input) {
		return neurons[0].push(input, this);
	}
	
}
