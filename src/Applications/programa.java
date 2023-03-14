package Applications;


import BoardGame.Board;
import chess.ChessMatch;

public class programa {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());
		
	}

}
