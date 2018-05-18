import java.util.ArrayList;
import java.util.List;

public class Node {
	
	private String name;
	private List<Node> neighborhood = new ArrayList<>();
	//private Node[] neighborhood new ;
	
	public List<Node> getNeighborhood() {
		return neighborhood;
	}

	public Node(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int neighborhoodSize() {
		return neighborhood.size();
	}
	
	public void addEdge(Node newNode) {
		neighborhood.add(newNode);
	}
	
	public void printNeighborhood() {
		for (int i=0; i < neighborhoodSize(); i++) {
			System.out.println(neighborhood.get(i).name);
		}
	}
}
