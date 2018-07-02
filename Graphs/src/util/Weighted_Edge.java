package util;

public class Weighted_Edge {
	public Weighted_Node from;	
	public Weighted_Node to;
	public double weight;
	
	public Weighted_Edge(Weighted_Node from, Weighted_Node to, double weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
}