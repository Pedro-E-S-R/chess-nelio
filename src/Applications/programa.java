package Applications;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPositon;
import chess.chessException;

public class programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessmatch = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();
		
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printMach(chessmatch, captured);
				System.out.println();
				System.out.print("Source: ");
				ChessPositon source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = chessmatch.possibleMoves(source);
				
				UI.clearScreen();
				UI.printBoard(chessmatch.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPositon target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
				
				if( capturedPiece != null) {
					captured.add(capturedPiece);
				}
				
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
