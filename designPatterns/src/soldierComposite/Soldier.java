package soldierComposite;

abstract class Soldier {
	protected String name;
	protected Rank rank;
	
	public Soldier(String name,Rank rank) {
		this.name=name;
		this.rank=rank;
	}
	public abstract void addSoldier(Soldier soldier);
	public abstract void removeSoldier(Soldier soldier);
	public abstract void executeSoldier();

}
