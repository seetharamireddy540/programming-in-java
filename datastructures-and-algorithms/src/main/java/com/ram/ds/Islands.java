package com.ram.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Islands {

    public static void main(String[] args) {

        int[] name = new int[]{3, 4};

        int M[][] = new int[][]{
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        Map<String, List<String>> map = new HashMap<>();

        List<List<Integer>> gridList = new ArrayList<>();

        gridList.add(List.of(1, 1, 0, 0, 0));
        gridList.add(List.of(0, 1, 0, 0, 1));
        gridList.add(List.of(1, 0, 0, 1, 1));
        gridList.add(List.of(0, 0, 0, 0, 0));
        gridList.add(List.of(1, 0, 1, 0, 1));

        Islands islands = new Islands();
        System.out.println("\n Number of islands is: " + islands.countIslands(M));

    }

    public int countIslands(int[][] grid) {

        int noOfIslands = 0;

        int ROW = grid.length;
        int COL = grid[0].length;
        System.out.printf("Grid size : ROW = " + ROW + "COL = " + COL);

        boolean visited[][] = new boolean[ROW][COL];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    noOfIslands = noOfIslands + 1;
                    DFS(grid, i, j, visited);
                }
            }
        }

        return noOfIslands;
    }

    private void DFS(int[][] grid, int row, int col, boolean[][] visited) {

        int neighborCells[][] = new int[][]{{-1, -1},
                {-1, 0},
                {-1, 1},
                {0, -1},
                {0, 1},
                {1, -1},
                {1, 0},
                {1, 1}};

        visited[row][col] = true;

        for (int k = 0; k < 8; k++) {
            if (isSafe(grid, row + neighborCells[k][0], col + neighborCells[k][1], visited)) {
                DFS(grid, row + neighborCells[k][0], col + neighborCells[k][1], visited);
            }
        }
    }

    private boolean isSafe(int[][] grid, int row, int col, boolean[][] visited) {
        return (row >= 0 && row < grid.length && col >= 0 && col < grid[row].length && (grid[row][col] == 1 && !visited[row][col]));
    }
}
