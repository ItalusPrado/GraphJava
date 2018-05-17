import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private List<Node> nodes = new ArrayList<>();
	private List<String> nodeNames = new ArrayList<>();
	
	public void addNode(Node newNode, Node[] links) {
		
		Node[] arrayLinks = links;
		
		if (this.nodeNames.contains(newNode.getName())){
			System.out.println("Node with this name already exist");
		} else {
			this.nodes.add(newNode);
			this.nodeNames.add(newNode.getName());
			
			for (int i = 0; i < arrayLinks.length; i++) {
				if (this.nodeNames.contains(arrayLinks[i].getName())) {
					for (Node node : nodes) {
						if (node.getName() == arrayLinks[i].getName()){
							arrayLinks[i] = node;
						}
					}
				} else {
					this.nodes.add(arrayLinks[i]);
					this.nodeNames.add(arrayLinks[i].getName());
				}
				newNode.addEdge(arrayLinks[i]);
				arrayLinks[i].addEdge(newNode);
			}
		}
	}
}
