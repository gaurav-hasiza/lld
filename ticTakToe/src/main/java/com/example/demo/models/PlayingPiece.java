package com.example.demo.models;


import com.example.demo.enums.PieceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
public class PlayingPiece {
    private PieceType pieceType;
}
