package com.example.demo;

import com.example.demo.controller.TicTacToeGameController;
import com.example.demo.enums.PieceType;
import com.example.demo.models.Player;
import com.example.demo.models.PlayingPiece;
import com.example.demo.service.TicTacToeGame;

public class DemoApplication {

	public static void main(String[] args) {
		Player player1 = new Player("Gaurav", new PlayingPiece(PieceType.X));
		Player player2 = new Player("Gaurav", new PlayingPiece(PieceType.O));
		TicTacToeGame ticTacToeGame = new TicTacToeGame(player1, player2, 3);
		TicTacToeGameController ticTacToeGameController =new TicTacToeGameController(ticTacToeGame);
		ticTacToeGameController.startGame();
	}
}
