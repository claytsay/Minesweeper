package com.tsaysoft.minesweeper;

import android.graphics.Point;

import java.util.ArrayList;
import java.util.List;

public class GridManager {
    /**
     *
     */

    private Tile[][] gridArray;
    private final int X_DIMENSION;
    private final int Y_DIMENSION;

    // --------------------
    // CONSTRUCTORS
    // --------------------

    /**
     * Generates a GridManager with specified parameters.
     *
     * @param x
     * @param y
     * @param numMines
     */
    public GridManager(int x, int y, int numMines) {
        X_DIMENSION = x;
        Y_DIMENSION = y;
        gridArray = new Tile[x][y];

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                gridArray[i][j] = new Tile();
            }
        }

        generateMines(numMines);
    }


    // --------------------
    // SETTERS & GETTERS
    // --------------------

    // --------------------
    // PUBLIC UTILITY METHODS
    // --------------------

    // --------------------
    // PRIVATE UTILITY METHODS
    // --------------------

    /**
     * Generates mines.
     * <p>
     *     Randomly generates coordinates and sets the appropriate tiles in gridArray to be mines.
     * </p>
     * @param numMines
     */
    private void generateMines(int numMines) {
        generateMines(numMines, null);
    }

    /**
     * Generates mines, excluding a certain point from being a mine.
     * <p>
     *     TODO: Add checks to prevent inappropriate use
     * </p>
     * @param numMines
     * @param exclude
     */
    private void generateMines(int numMines, Point exclude) {
        List<Point> randomPoints = new ArrayList<>();
        int randX;
        int randY;
        Point randPoint = null;
        boolean success;

        if (exclude != null) {
            randomPoints.add(exclude);
        }

        for(int i = 0; i < numMines; i++) {
            success = false;

            while (!success) {
                randX = (int)(Math.random()*X_DIMENSION);
                randY = (int)(Math.random()*Y_DIMENSION);
                randPoint = new Point(randX, randY);

                success = true;
                for(Point p : randomPoints) {
                    if (randPoint.x == p.x && randPoint.y == p.y) {
                        success = false;
                    }
                }
            }

            randomPoints.add(randPoint);

        }

        for(Point p : randomPoints) {
            gridArray[p.x][p.y].setMine(true);
        }
    }

    /**
     * Generates the numbers for the tiles.
     * <p>
     *     Generates the numbers that non-mine tiles display when uncovered.
     * </p>
     */
    private void generateNumbers() {

    }

}
