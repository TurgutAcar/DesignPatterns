package soldierFlyWeight;

public abstract class Soldier {
	protected String unitName;
	protected String guns;
	protected String health;
	
	//endregion
	 
    //region Extrinsic Fields

    // Ýstemci tarafýndan deðerlendirilip hesaplanan ve MoveTo operasyonua gönderilerek FlyWeight nesne örnekleri tarafýndan deðerlendirilen veriler
    protected int X;
    protected int Y;

    //endregion

    public abstract void MoveTo(int x, int y);
}
