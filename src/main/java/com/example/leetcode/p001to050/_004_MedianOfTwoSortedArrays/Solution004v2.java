package com.example.leetcode.p001to050._004_MedianOfTwoSortedArrays;


public class Solution004v2 implements Solution004 
{
  public double findMedianSortedArrays(int[] nums1, int[] nums2)
  {
    double median = 0.0; 
    
    if ((nums1 == null) || (nums2 == null)) return 0;
    
    int alen = nums1.length;
    int blen = nums2.length;
    int sumlen = alen + blen;
    
    // 憒�������摨血� 0, 銵函內瘝�遙雿���, ����  0
    if ((alen == 0) && (blen == 0)) return 0;
    
    // 憒�������摨血� 1, 銵函內�����������甇文�����
    if (sumlen == 1) return (alen == 0) ? nums2[0] : nums1[0];
    
    // 憒�������摨血� 2, 銵函內��������������像����
    if (sumlen == 2) 
    {
      if (alen == 0)      return (nums2[0] + nums2[1]) / 2.0;
      else if (blen == 0) return (nums1[0] + nums1[1]) / 2.0;
      else                return ((nums1[0] + nums2[0]) / 2.0);
    }
    
    boolean isSingleMedian = ((sumlen % 2) == 1);
    if (isSingleMedian) 
    {
      int mid1 = (sumlen / 2) + 1;
      median = findKthValue(nums1, nums2, mid1);
    } 
    else 
    {
      int mid1 = sumlen / 2;
      median = (findKthValue(nums1, nums2, mid1)
             +  findKthValue(nums1, nums2, mid1+1)) / 2.0;
    }
    return median;
  }

  public double findKthValue(int[] nums1, int[] nums2, int k)
  {
    double val = 0.0;
    
    int alen = nums1.length;
    int blen = nums2.length;
    
    int i = 0;
    int ia = 0, ib = 0;
    
    System.out.println("\r\nk: " + k);
    
    while (i++ < k)
    {
      System.out.print(i + ": " + ia + ", " + ib + ",\t");

      if ((ia == alen) || (ib == blen))
      { 
        val = (ia == alen) ? nums2[k-alen-1] : nums1[k-blen-1];
        break;
      }
      
      if (nums1[ia] <= nums2[ib])
      {
        val = nums1[ia];
        ia++;
      }
      else
      {
        val = nums2[ib];
        ib++;
      }
      System.out.println(val);
    }
    System.out.println("val: " + val);
    
    return val;
  }
}
