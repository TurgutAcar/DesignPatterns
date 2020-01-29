package pieceFlyweight;

import java.util.HashMap;
import java.util.Map;

public class PieceFactory {
	private static final Map<String,Piece> pieceMap = new HashMap<String, Piece>();
	
	public static Piece getPiece(String pieceType) {
		Piece piece = null;
		if(pieceMap.get(pieceType)!=null) {
			piece =pieceMap.get(pieceType);
		}else {
			if(pieceType.equalsIgnoreCase("I")) {
				piece =new I();
			}else if(pieceType.equalsIgnoreCase("T")) {
				piece =new T();
			}else if(pieceType.equalsIgnoreCase("J")) {
				piece =new J();
			}
			pieceMap.put(pieceType, piece);
		}
		return piece;
	}

}
