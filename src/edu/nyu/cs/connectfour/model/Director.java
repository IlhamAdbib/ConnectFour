package edu.nyu.cs.connectfour.model;

public class Director {

        private BoardBuilder builder;

        public Director(BoardBuilder builder) {
            this.builder = builder;
        }

        public Board construct(int rows, int columns) {
            return builder.buildFromRow(rows).buildFromCol(columns).build();
        }
    }

