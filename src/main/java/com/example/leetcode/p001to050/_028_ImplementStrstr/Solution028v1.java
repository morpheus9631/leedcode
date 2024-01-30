package com.example.leetcode.p001to050._028_ImplementStrstr;

/*
 * 170322: Your runtime beats 67.36% of java submissions
 */
public class Solution028v1 implements Solution028
{
  public int strStr(String haystack, String needle) 
  {
    int result = -1;
    
    result = haystack.indexOf(needle);
    
    return result;
  }
}
