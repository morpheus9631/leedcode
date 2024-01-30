package com.example.leetcode._001_to_050._001_TwoSum;

import java.util.Arrays;

public class Main001
{
  public static void main(String[] args)
  {
    System.out.println("1. Two Sum");

    String format = "\r\nnums = %s, target = %d"
                  + "\r\nReturn: %s"
                  ;
    
    Solution001v3 sol = new Solution001v3();
    
    for (int[][] testcase : _testCases)
    {
      int target = testcase[0][0];
      int[] nums = testcase[1];
      
      int[] idxs = sol.twoSum(nums, target);
      
      System.out.println(String.format(format, 
          Arrays.toString(nums), target, Arrays.toString(idxs)));
    }
  }
  
  private static int[][][] _testCases = 
  {
      { {9}, {2,7,11,15} }    // Expected: [0,1]
    , { {6}, {3,2,4} }        // Expected: [1,2]
    , { {0}, {0,4,3,0} }      // Expected: [0,3]
    , { {0}, {-3,4,3,90} }    // Expected: [0,2]
  };
}
