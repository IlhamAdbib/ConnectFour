package edu.nyu.cs.connectfour.model;

public interface Builder {
    BoardBuilder buildFromRow(int rows);
    BoardBuilder buildFromCol(int columns);
    Board build();
}
