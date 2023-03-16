package Applications;


import java.util.Scanner;

import BoardGame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPositon;

public class programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessmatch = new ChessMatch();
		
		
		while (true) {
			UI.printBoard(chessmatch.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPositon source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.println("Target: ");
			ChessPositon target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
		}
		
		
	}

}
