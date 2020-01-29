package soldierComposite;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Root oluþturulur.   
		   CompositeSoldier generalBurak=new CompositeSoldier("Burak",Rank.General);
		    
		   // root altýna Leaf tipten nesne örnekleri eklenir.
		   generalBurak.addSoldier(new PrimitiveSoldier("Mayk",Rank.Colonel));
		   generalBurak.addSoldier(new PrimitiveSoldier("Tobiassen",Rank.Colonel));
		    
		   // Composite tipler oluþturulur.
		   CompositeSoldier colonelNevi=new CompositeSoldier("Nevi", Rank.Colonel);   
		   CompositeSoldier lieutenantColonelZing=new CompositeSoldier("Zing", Rank.LieutenantColonel);
		    
		   // Composite tipe baðlý primitive tipler oluþturulur.
		   lieutenantColonelZing.addSoldier(new PrimitiveSoldier("Tomasson", Rank.Captain));
		   colonelNevi.addSoldier(lieutenantColonelZing);
		   colonelNevi.addSoldier(new PrimitiveSoldier("Mayro", Rank.LieutenantColonel));
		   // Root' un altýna Composite nesne örneði eklenir.
		   generalBurak.addSoldier(colonelNevi);
		    
		   // 
		   generalBurak.addSoldier(new PrimitiveSoldier("Zulu",Rank.Colonel));
		    
		   // root için ExecuteOrder operasyonu uygulanýr. Buna göre root altýndaki tüm nesneler için bu operasyon uygulanýr
		 // generalBurak.executeSoldier();
		   lieutenantColonelZing.executeSoldier();

	}

}
