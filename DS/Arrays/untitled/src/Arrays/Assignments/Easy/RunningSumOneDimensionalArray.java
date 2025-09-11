package Arrays.Assignments.Easy;

import java.util.Arrays;

public class RunningSumOneDimensionalArray
{
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13};
        System.out.println("Running Sum of 1D array: "+ Arrays.toString(RunningSum(arr)));
    }
    public static int[] RunningSum(int[] nums)
    {
        //optimized solution
        int n = nums.length;
        for(int i = 1; i<n; i++)
        {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static int[] BruteForce_RunningSum(int[] nums)
    {
        //BruteForce Approach
        int[] arrayResult = new int[nums.length];

        for(int i = 0; i<nums.length;i++)
        {
            for (int j = 0; j<=i; j++)
            {
                arrayResult[i]+=nums[j];
            }
        }
        return arrayResult;
    }
}
