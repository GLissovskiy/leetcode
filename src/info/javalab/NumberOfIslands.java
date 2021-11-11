package info.javalab;

/*
* 200. Number of Islands
* https://leetcode.com/problems/number-of-islands/
*
* Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
*
*Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3


Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
*
*
* */

public class NumberOfIslands {

    public static void main(String[] args){
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid =  {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println("Application started...");
        System.out.println(numberOfIslands.numIslands(grid));
    }

    public int numIslands(char[][] grid) {

        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0 ; j < grid[i].length; j++){
                if (grid[i][j] == '1'){
                    count += 1;
                    checkBoundary(grid, i, j);
                }
            }
        }

        return count;

    }

    public void checkBoundary(char [][] grid, int i , int j){
        if(i<0 || i>=grid.length || j <0 || j>grid[i].length ||grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        checkBoundary(grid, i+1, j); // up
        checkBoundary(grid, i-1, j); // down
        checkBoundary(grid, i, j-1); // left
        checkBoundary(grid, i, j+1); // right

    }

}
