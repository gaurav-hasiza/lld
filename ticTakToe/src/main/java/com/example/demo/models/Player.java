package com.example.demo.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Getter
public class Player {
    private final String name;
    private final PlayingPiece playingPiece;
}
