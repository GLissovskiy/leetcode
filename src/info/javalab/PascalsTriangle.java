package info.javalab;

/*
 * https://leetcode.com/problems/pascals-triangle
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 * Example 1:
 *
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 *
 * Input: numRows = 1
 * Output: [[1]]
 *
 *
 * Constraints:
 *
 * 1 <= numRows <= 30
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class PascalsTriangle {

    public static void main(String[] args){
        System.out.println("Applications Started...");

        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> test = pascalsTriangle.generate(10);

        for (int i = 0; i< test.size(); i++){
            System.out.println(Arrays.toString(test.get(i).toArray()));
        }

        System.out.println("Bye.");

    }

    public List<List<Integer>> generate(int numRows){

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows ==0 ) return triangle;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // starting from 2 row because fisrt one = 1
        for(int i= 1 ; i< numRows; i++){
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // first element always 1

            // loop from 2 to size - 1
            for(int j = 1; j < i; j++){
                row.add(prev_row.get(j-1) + prev_row.get(j));
            }

            row.add(1); // last element always 1
            triangle.add(row);

        }
        return triangle;

    }
}
