package com.ram.game;

import lombok.Builder;

public class GameBoard {

    public static void main(String[] args) {

    }

    public static class Cell {
        private Position position;
        private String name;
        boolean isLadderAvailable;
        boolean isSnake;
        private Cell destinationCell;

        public Cell(Position position, String name) {
            this.position = position;
            this.name = name;
        }

        public static class Position {
            int row, col;

        }
    }
}
