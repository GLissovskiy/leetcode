package info.javalab;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args){

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] testArray = {1,2,3,4,1};

        boolean result = containsDuplicate.duplicates(testArray);

        System.out.println(String.valueOf(result));

        System.out.println(String.valueOf(containsDuplicate.duplicatesBySort(testArray)));

    }

    public boolean duplicates(int[] nums){

        HashSet<Integer> numbers = new HashSet<>();

        for(int i = 0; i < nums.length ; i ++){

            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }

        return false;

    }

    public boolean duplicatesBySort(int[] nums){

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){

            if (nums[i] == nums[i+1]) return true;

        }

        return false;

    }
}
