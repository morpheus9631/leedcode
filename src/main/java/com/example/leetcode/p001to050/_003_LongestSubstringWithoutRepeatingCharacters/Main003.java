package com.example.leetcode.p001to050._003_LongestSubstringWithoutRepeatingCharacters;

import com.example.leetcode.utils.myStringUtils;

public class Main003
{
  public static void main(String[] args)
  {
    System.out.println("3. Longest Substring Without Repeating Characters");
    
    String format = "\r\nString: %s"
                  + "\r\nLength is %d"
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
    Solution003 sol = new Solution003v1();
    
    String[] testcases = getTestCases();
    for (String str : testcases)
    {
      int len = sol.lengthOfLongestSubstring(str);
      
      System.out.println(String.format(format, str, len));
    }
  }
  
  private static String[] getTestCases()
  {
    String[] testcases = 
    {
        "abcabcbb"
      , "bbbbb"
      , "pwwkew"
      , "c"             // Expected: 1
      , "aab"           // Expected: 2
    };
    return testcases;
  }
}
