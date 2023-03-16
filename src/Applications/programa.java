package Applications;


import java.util.InputMismatchException;
import java.util.Scanner;

import BoardGame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPositon;
import chess.chessException;

public class programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessmatch = new ChessMatch();
		
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessmatch.getPieces());
				System.out.println();
				System.out.println("Source: ");
				ChessPositon source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.println("Target: ");
				ChessPositon target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
			}
			catch(chessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				
			}
			
		}
		
		
	}

}
