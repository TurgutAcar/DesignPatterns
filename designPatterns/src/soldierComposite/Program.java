package soldierComposite;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Root olu�turulur.   
		   CompositeSoldier generalBurak=new CompositeSoldier("Burak",Rank.General);
		    
		   // root alt�na Leaf tipten nesne �rnekleri eklenir.
		   generalBurak.addSoldier(new PrimitiveSoldier("Mayk",Rank.Colonel));
		   generalBurak.addSoldier(new PrimitiveSoldier("Tobiassen",Rank.Colonel));
		    
		   // Composite tipler olu�turulur.
		   CompositeSoldier colonelNevi=new CompositeSoldier("Nevi", Rank.Colonel);   
		   CompositeSoldier lieutenantColonelZing=new CompositeSoldier("Zing", Rank.LieutenantColonel);
		    
		   // Composite tipe ba�l� primitive tipler olu�turulur.
		   lieutenantColonelZing.addSoldier(new PrimitiveSoldier("Tomasson", Rank.Captain));
		   colonelNevi.addSoldier(lieutenantColonelZing);
		   colonelNevi.addSoldier(new PrimitiveSoldier("Mayro", Rank.LieutenantColonel));
		   // Root' un alt�na Composite nesne �rne�i eklenir.
		   generalBurak.addSoldier(colonelNevi);
		    
		   // 
		   generalBurak.addSoldier(new PrimitiveSoldier("Zulu",Rank.Colonel));
		    
		   // root i�in ExecuteOrder operasyonu uygulan�r. Buna g�re root alt�ndaki t�m nesneler i�in bu operasyon uygulan�r
		 // generalBurak.executeSoldier();
		   lieutenantColonelZing.executeSoldier();

	}

}
