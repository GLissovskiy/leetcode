package info.javalab;

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
* You can return the answer in any order.
*
*Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*
*
* */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String [] args){

        System.out.println("Application started...");

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.getTwoSumBrute(new int[] {2,7,11,15}, 9 );

        for (int i = 0 ; i < result.length; i ++) {
            System.out.println(result[i]);
        }

        int [] resultHash = twoSum.getTwoSumHash(new int[] {2,7,11,15}, 9 );
        for (int i = 0 ; i < resultHash.length; i ++) {
            System.out.println(resultHash[i]);
        }

    }

    public int[] getTwoSumBrute(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            for (int j  = i + 1 ;j < nums.length; j++){
                int delta = target - nums[i];

                if (delta == nums[j]){
                    return new int[] {i,j};
                }
            }
        }

        return null;
    }


    // Time: O(n)  - we see 1 for loop, that mean if there are n items in array, potentially I need to look at them once
    // big O of N algorithm of time
    // Space: O(n) - we need to add n elements to our map,
    public int [] getTwoSumHash(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            int delta = target - nums[i];

            if (map.containsKey(delta)){
                return new int[]{i, map.get(delta)};
            }

            map.put(nums[i],i);

        }

        throw new IllegalArgumentException("no match found!");
        //return null;
    }


}
