package Arrays.Assignments.Easy;

import java.util.Arrays;

public class BuildArrayFromPermutation
{
    public static void main(String[] args) {
        int[] res = buildArray(new int[]{0,1,2,3,4,5,6});
        System.out.println("Input: [0,1,2,3,4,5,6]");
        System.out.println("Output: "+Arrays.toString(res));
    }
    public static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
