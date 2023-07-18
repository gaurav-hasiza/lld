package com.example.demo.models;

import com.example.demo.enums.PieceType;
import lombok.RequiredArgsConstructor;

import java.util.Collections;

//@RequiredArgsConstructor
public class Board {
    private final int size;
    private PlayingPiece[][] playingPieces;
    public Board(int size){
        this.size = size;
        this.playingPieces = new PlayingPiece[size][size];
        for(int i = 0 ; i< size ;i ++){
            for(int j = 0; j < size; j++){
                this.playingPieces[i][j] = new PlayingPiece(PieceType.EMPTY);
            }
        }
    }

    public PieceType getPiece(int i, int j){

        return this.playingPieces[i][j].getPieceType();
    }
    public boolean addPiece(int i, int j, PieceType playingPiece){
        if ( i >= this.size  && j >= this.size){
            return false;
        }
        if(playingPieces[i][j].getPieceType() == PieceType.EMPTY){
            playingPieces[i][j].setPieceType(playingPiece);
            return true;
        }
        return false;
    }

    public boolean isFull(){
        for(int i = 0 ; i < size; i++){
            for(int j = 0; j < size; j++) {
                if (playingPieces[i][j].getPieceType().equals(PieceType.EMPTY)) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean isWinner(PieceType pieceType) {
        for (int row = 0; row < 3; row++) {
            if (playingPieces[row][0].getPieceType().equals(pieceType) &&
                    playingPieces[row][1].getPieceType().equals(pieceType) &&
                    playingPieces[row][2].getPieceType().equals(pieceType))
                return true;
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (playingPieces[0][col].getPieceType().equals(pieceType) &&
                    playingPieces[1][col].getPieceType().equals(pieceType) &&
                    playingPieces[2][col].getPieceType().equals(pieceType))
                return true;
        }

        // Check diagonals
        if (playingPieces[0][0].getPieceType().equals(pieceType) &&
                playingPieces[1][1].getPieceType().equals(pieceType) &&
                playingPieces[2][2].getPieceType().equals(pieceType))
            return true;

        if (playingPieces[0][2].getPieceType().equals(pieceType) &&
                playingPieces[1][1].getPieceType().equals(pieceType) &&
                playingPieces[2][0].getPieceType().equals(pieceType))
            return true;

        return false;
    }

    public void printBoard(){
        for(int i = 0; i < size ;i ++){
            for(int j = 0; j < size ;j++){
                System.out.print(playingPieces[i][j] + " | ");
            }
            System.out.println("|");
        }
    }

}
