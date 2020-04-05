package com.ram.ds;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Given a 2D grid, each cell is either a zombie 1 or a human 0.
 * Zombies can turn adjacent (up/down/left/right) human beings into zombies every hour. Find out how many hours does it take to infect all humans?
 */
public class Zombie {

    public static void main(String[] args) {

        int grid[][] = {
                {0, 1, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0}};

        System.out.printf("Number of hours to turn whole world into Zombie land : " + minHours(grid.length, grid[0].length, grid));
    }


    public static int minHours(int ROW, int COL, int[][] grid) {
        int minNumberOfHours = 0;
        int zombieCount = 0;
        int target = ROW * COL;
        Deque<int[]> queue = new LinkedList<>();

        // Store the all zombie locations in the queue to process one by one.
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 1) {
                    zombieCount++;
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int nbrs[][] = {
                {-1, 0}, // Top
                {1, 0},  // Bottom
                {0, -1}, // Left
                {0, 1} // Right
        };

        while (!queue.isEmpty()) {
            int queuSize = queue.size();
            if (zombieCount == target) {
                return minNumberOfHours;
            }
            for (int i = 0; i < queuSize; i++) {  // Minor variation of BSF.
                int[] zombieLocation = queue.poll();
                for (int[] nbr : nbrs) {
                    int ni = zombieLocation[0] + nbr[0];
                    int nj = zombieLocation[1] + nbr[1];

                    if (ni >= 0 && ni < ROW && nj >= 0 && nj < COL && grid[ni][nj] == 0) {
                        grid[ni][nj] = 1; // Turn human to zombie
                        zombieCount++;

                        queue.add(new int[]{ni, nj}); // Add new zombie to queue to turn his/her nbrs to zombies in next iteration.
                    }
                }
            }
            minNumberOfHours++;
        }
        return -1;
    }
}
