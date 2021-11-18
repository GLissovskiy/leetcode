package info.javalab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*
* 412. Fizz Buzz
Easy

1660

1807

Add to List

Share
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i if non of the above conditions are true.


Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]


Constraints:

1 <= n <= 104
*
*
* */
public class FizzBuzz {

    public static void main(String[] args){

        FizzBuzz fizzBuzz = new FizzBuzz();

        List<String> resultList = new ArrayList<String>();
        resultList = fizzBuzz.fizzBuzz(15);

        List<String> resultList2 = new ArrayList<String>();
        resultList2 = fizzBuzz.fizzbuzz2(15);

        System.out.println(Arrays.deepToString(resultList.toArray()));
        System.out.println(Arrays.deepToString(resultList2.toArray()));

    }

    public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {

            if ((i % 3) == 0 && (i % 5 == 0)) {
                resultList.add("FizzBuzz");

            } else if (i % 3 == 0) {
                resultList.add("Fizz");

            } else if (i % 5 == 0) {
                resultList.add("Buzz");

            } else {
                resultList.add(String.valueOf(i));
            }

        }

        return resultList;
    }

    public List<String> fizzbuzz2(int n) {

        List<String> resultList = new ArrayList<>();

        for(int i = 1, fizz = 0, buzz = 0; i <= n; i++){
            fizz ++;
            buzz ++;

            if(fizz == 3 && buzz == 5){
                fizz = 0;
                buzz = 0;
                resultList.add("FizzBuzz");
            } else if ( fizz == 3){
                fizz = 0;
                resultList.add("Fizz");
            } else if ( buzz == 5){
                buzz = 0;
                resultList.add("Buzz");
            } else {
                resultList.add(Integer.toString(i));
            }
        }

        return resultList;
    }
}
