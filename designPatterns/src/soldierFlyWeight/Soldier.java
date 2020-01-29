package soldierFlyWeight;

public abstract class Soldier {
	protected String unitName;
	protected String guns;
	protected String health;
	
	//endregion
	 
    //region Extrinsic Fields

    // �stemci taraf�ndan de�erlendirilip hesaplanan ve MoveTo operasyonua g�nderilerek FlyWeight nesne �rnekleri taraf�ndan de�erlendirilen veriler
    protected int X;
    protected int Y;

    //endregion

    public abstract void MoveTo(int x, int y);
}
