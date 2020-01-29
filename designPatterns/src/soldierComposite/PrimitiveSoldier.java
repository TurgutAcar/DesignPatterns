package soldierComposite;

public class PrimitiveSoldier extends Soldier {

	public PrimitiveSoldier(String name, Rank rank) {
		super(name, rank);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addSoldier(Soldier soldier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSoldier(Soldier soldier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executeSoldier() {
		// TODO Auto-generated method stub
		System.out.println("{00}"+rank+"{11}"+name);
		

	}

}
