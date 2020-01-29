package soldierFlyWeight;

public abstract class Soldier {
	protected String unitName;
	protected String guns;
	protected String health;
	
	//endregion
	 
    //region Extrinsic Fields

    // İstemci tarafından değerlendirilip hesaplanan ve MoveTo operasyonua gönderilerek FlyWeight nesne örnekleri tarafından değerlendirilen veriler
    protected int X;
    protected int Y;

    //endregion

    public abstract void MoveTo(int x, int y);
}
