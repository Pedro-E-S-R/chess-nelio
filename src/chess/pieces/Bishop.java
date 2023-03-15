package chess.pieces;

import BoardGame.Board;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{

	public Bishop(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return "B";
	}
	

}
