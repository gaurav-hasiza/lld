package com.example.demo.service;


import com.example.demo.enums.PieceType;
import com.example.demo.models.Board;
import com.example.demo.models.Player;
import lombok.Data;

import java.util.Deque;

@Data
public class TicTacToeGame {
    private Deque<Player> players;
    private Board board;
    public TicTacToeGame(Player player1, Player player2, int size){
        players.add(player1);
        players.add(player2);
        board = new Board(size);
    }

    public void startGame() {
        while(true){
            Player currentPlayer = players.removeFirst();

            if(isGameOver() ){
                System.out.println("Game is draw");
                break;
            }
            boolean isSuccess = false;
            while (!isSuccess){ // this is to check if the user is making incorrect move or not
                //TODO take i, j as input
                int i = 0;
                int j = 0;
                isSuccess = makeMove(i, j, currentPlayer.getPlayingPiece().getPieceType());
            }
            if (board.isWinner(currentPlayer.getPlayingPiece().getPieceType())) {
                System.out.println("Hurrah Player " + currentPlayer.getName() + " Won ");
                break;
            }
            players.addLast(currentPlayer);

            // print the Board
            board.printBoard();
        }
    }

    public boolean makeMove(int row, int col, PieceType pieceType) {
        return board.addPiece(row, col, pieceType);
    }

    public boolean isGameOver() {
        return board.isFull();
    }
}
