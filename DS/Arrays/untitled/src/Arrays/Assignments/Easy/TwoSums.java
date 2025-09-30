package Arrays.Assignments.Easy;

import java.util.Arrays;

public class TwoSums
{
    public static void main(String[] args) {
        //int[][] nums1 = new int[3][];
        int[] nums = {2,5,7,11};
        int target = 9;
        int[] indexResult = new int[2];
        for(int i = 0; i<nums.length;i++)
        {
            for(int j = i; j<nums.length; j++)
            {
                if(i!=j)
                {
                    int result = nums[i]+nums[j];
                    if(result == target)
                    {
                        indexResult[0] = i;
                        indexResult[1] = j;
                        System.out.println(Arrays.toString(indexResult));
                    }
                }
            }
        }
    }
}
