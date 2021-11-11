package info.javalab;

public class NumberOfIslands {

    public static void main(String[] args){

        
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
