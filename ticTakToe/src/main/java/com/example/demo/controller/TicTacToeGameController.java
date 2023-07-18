package com.example.demo.controller;

import com.example.demo.service.TicTacToeGame;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TicTacToeGameController {
    private final TicTacToeGame ticTacToeGame;
    public void startGame(){
        ticTacToeGame.startGame();
    }
}
