import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
	
	public void generateGraph() {
		PrintWriter writer;
		try {
			writer = new PrintWriter("testandoGraph.txt", "UTF-8");
			writeOnFile(writer);
			
			System.out.println("File Succesfull");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<String> getNodeNames() {
		return this.nodeNames;
	}
	
	private void writeOnFile(PrintWriter writer){
		writer.println("digraph G {");
		for (Node node : nodes) {
			for (Node linkNode : node.getNeighborhood()) {
				writer.println("	"+node.getName()+" -- "+linkNode.getName()+" [label=\"\"]; ");
			}
			
		}
		writer.println("}");
		writer.close();
	}
}
