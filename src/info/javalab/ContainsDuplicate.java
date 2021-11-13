package info.javalab;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args){

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] testArray = {1,2,3,4,1};

        boolean result = containsDuplicate.duplicates(testArray);

        System.out.println(String.valueOf(result));

    }

    public boolean duplicates(int[] nums){

        HashSet<Integer> numbers = new HashSet<>();

        for(int i = 0; i < nums.length ; i ++){

            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }

        return false;

    }
}
