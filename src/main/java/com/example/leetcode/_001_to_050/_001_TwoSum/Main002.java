package com.example.leetcode._001_to_050._001_TwoSum;

import java.util.Arrays;

public class Main002
{
	public static void main(String[] args)
	{
		Main002 two_sum = new Main002();
		Solution001 sol = new Solution001v1();
		
		TestCase[] test_cases = two_sum.getTestCases();
		for (TestCase tc : test_cases)
		{
			int target = tc.getTarget();
			int[] nums = tc.getNums();

			String mesg = "Give nums = "+Arrays.toString(nums)+", target = "+target;
			System.out.println(mesg);

			int[] ans = sol.twoSum(nums, target);
			String result = (ans == null) ? "No two sum solution." : Arrays.toString(ans);
			
			System.out.println(result);
			System.out.println();
		}
	}

	class TestCase
	{
		private int _target;
		private int[] _nums;
		
		public TestCase(int target, int[] nums)
		{
			this._target = target;
			this._nums = nums;
		}
		
		public int getTarget() { return this._target; }
		public int[] getNums() { return this._nums; }
	}

	public TestCase[] getTestCases()
	{
		TestCase[] test_cases = new TestCase[4];
		
		test_cases[0] = new TestCase(9, new int[] {2,7,11,15}); 
		test_cases[1] = new TestCase(6, new int[] {3,2,45}); 
		test_cases[2] = new TestCase(0, new int[] {0,4,3,0}); 
		test_cases[3] = new TestCase(0, new int[] {-3,4,3,90}); 
				
		return test_cases;
	}
}


