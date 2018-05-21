
public class Main {
	
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		
		Node nodeA = new Node("a");
		Node nodeB = new Node("b");
		Node nodeC = new Node("c");
		
		Node[] nodes = {nodeB,nodeC};
		
		graph.addNode(nodeA, nodes);
		graph.generateGraph();
	}
}
