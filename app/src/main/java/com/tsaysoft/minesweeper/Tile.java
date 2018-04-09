package com.tsaysoft.minesweeper;

public class Tile {
    /**
     *
     */

    private boolean isMine;
    private boolean isUncovered;
    private int adjacentMines;

    // --------------------
    // CONSTRUCTORS
    // --------------------

    /**
     * By default, constructs a tile that is not a mine.
     */
    public Tile () {
        super();
        isUncovered = false;
        isMine = false;
    }


    // --------------------
    // SETTERS & GETTERS
    // --------------------
    public void setMine(boolean is_Mine) {
        isMine = is_Mine;
    }

    public boolean getMine() {
        return isMine;
    }

    public void setAdjacentMines(int num_Mines) {
        adjacentMines = num_Mines;
    }

    public int getAdjacentMines() {
        return adjacentMines;
    }


    // --------------------
    // PUBLIC UTILITY METHODS
    // --------------------



    // --------------------
    // PRIVATE UTILITY METHODS
    // --------------------

}
