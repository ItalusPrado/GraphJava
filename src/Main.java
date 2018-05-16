
public class Main {
	
	public static void main(String[] args) {
		
		Node batata = new Node("batata");
		Node cenoura = new Node("cenoura");
		Node beterraba = new Node("beterraba");
		
		batata.addLink(cenoura);
		beterraba.addLink(batata);
		
		batata.printNeighborhood();
		System.out.println("\n");
		cenoura.printNeighborhood();
		System.out.println("\n");
		beterraba.printNeighborhood();
	}
}
