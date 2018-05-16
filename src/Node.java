import java.util.ArrayList;
import java.util.List;

public class Node {
	
	private String name;
	private List<Node> neighborhood = new ArrayList<>();
	//private Node[] neighborhood new ;
	
	public Node(String name) {
		this.name = name;
	}
	
	public int neighborhoodSize() {
		return neighborhood.size();
	}
	
	public void addLink(Node newNode) {
		neighborhood.add(newNode);
		newNode.addNode(this);
	}
	
	public void addNode(Node newNode) {
		neighborhood.add(newNode);
	}
	
	public void printNeighborhood() {
		for (int i=0; i < neighborhoodSize(); i++) {
			System.out.println(neighborhood.get(i).name);
		}
	}
}
