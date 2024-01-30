package com.example.leetcode.p001to050._003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution003v1 implements Solution003
{
  public int lengthOfLongestSubstring(String s) 
  {
    int maxLen = 0;
    int startIdx = 0;
    
    Map<Character, Integer> idxMap = new HashMap<Character, Integer>();
    
    int len = s.length();
    for(int i=0; i<len; i++)
    {
      char ch = s.charAt(i);
      
      if (idxMap.containsKey(ch) && startIdx <= idxMap.get(ch))
      {
        maxLen = Math.max(maxLen, i-startIdx);
        startIdx = idxMap.get(ch) + 1;
      }
      idxMap.put(ch, i);
    }
    return Math.max(maxLen, len-startIdx);
  }  
}
