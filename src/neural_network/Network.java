package neural_network;

public class Network {
	
	public Neuron_Layer[] neurons;
	public Synapse_Layer[] synapses;
	
	public Network(int[] layout, boolean sigmoid) {
		neurons = new Neuron_Layer[layout.length];
		synapses = new Synapse_Layer[layout.length-1];
		
		for (int i = 0; i < neurons.length-1; i++) {
			neurons[i] = new Neuron_Layer(layout[i], i, sigmoid);
			synapses[i] = new Synapse_Layer(layout[i+1], layout[i], i);
		}
		neurons[layout.length-1] = new Neuron_Layer(layout[layout.length-1], layout.length-1, sigmoid);
	}
	
	public Network(int[] layout, double[][][] synapse_weights, boolean sigmoid) {
		neurons = new Neuron_Layer[layout.length];
		synapses = new Synapse_Layer[layout.length-1];
		
		for (int i = 0; i < neurons.length-1; i++) {
			neurons[i] = new Neuron_Layer(layout[i], i, sigmoid);
			synapses[i] = new Synapse_Layer(layout[i+1], layout[i], i, synapse_weights[i]);
		}
		
		neurons[layout.length-1] = new Neuron_Layer(layout[layout.length-1], layout.length-1, sigmoid);
	}
	
	public void update_weights(double[][][] synapse_weights) {
		for (int i = 0; i < synapse_weights.length; i++) {
			synapses[i].update_weights(synapse_weights[i]);
		}
	}
	
	public double[] getOutput(double[] input) {
		return neurons[0].push(input, this);
	}
	
}
