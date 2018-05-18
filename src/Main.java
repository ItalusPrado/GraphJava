
public class Main {
	
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		
		Node batata = new Node("batata");
		Node cenoura = new Node("cenoura");
		Node beterraba = new Node("beterraba");
		
		Node[] nodes = {cenoura,beterraba};
		
		graph.addNode(batata, nodes);
		
		batata.printNeighborhood();
		System.out.println("");
		cenoura.printNeighborhood();
		System.out.println("");
		beterraba.printNeighborhood();
		
		graph.generateGraph();
	}
}
