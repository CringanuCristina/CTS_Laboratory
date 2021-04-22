package ro.ase.csie.cts.g1093.dp.composite;

public class NPC extends AbstractNode{
	String name;
	int level;

	public NPC(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}

	@Override
	public void attack(String playerName) {
		System.out.println(String.format("%s is attacking %s", name, playerName));
		
	}

	@Override
	public void retreat() {
		System.out.println(String.format("%s is retreating", name));
		
	}

	@Override
	public void move() {
		System.out.println(String.format("%s is moving", name));
		
	}

	@Override
	public void addNode(AbstractNode node) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public AbstractNode getNode(int index) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void deleteNode(AbstractNode node) {
		throw new UnsupportedOperationException();
		
	}

}
