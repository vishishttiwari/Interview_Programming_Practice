package util;

import java.util.ArrayList;

public class Weighted_Node {
	public int value;
	public ArrayList<Weighted_Edge> list;
	
	public Weighted_Node(int value) {
		this.value = value;
		list = new ArrayList<Weighted_Edge>();
	}
}
