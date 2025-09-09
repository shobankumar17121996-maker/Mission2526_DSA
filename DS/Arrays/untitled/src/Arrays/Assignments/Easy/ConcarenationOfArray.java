package Arrays.Assignments.Easy;

import java.util.Arrays;

public class ConcarenationOfArray
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        System.out.println("Input: "+ Arrays.toString(arr));
        System.out.println("Output: "+ Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {

        int arrLength = nums.length;
        int[] ans = new int[2*(arrLength)];
        for(int i=0; i<arrLength; i++)
        {
            int placeElement = nums[i];
            ans[i] = placeElement;
            ans[i+arrLength] = placeElement;
        }
        return ans;
    }
}
