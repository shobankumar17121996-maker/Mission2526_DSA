package Arrays.Assignments.Easy;

import java.util.Arrays;

public class NumberOfSmallNumbersInArray
{
    public static void main(String[] args) {

        int[] inputArray = {8,1,2,2,3};
        int[] resultArray = smallerNumberThanCurrentNumber(inputArray);
        System.out.println(Arrays.toString(resultArray));

    }
    public static int[] smallerNumberThanCurrentNumber(int[] nums)
    {
        int inputArrayLength = nums.length;
        int[] result = new int[inputArrayLength];
        for(int i = 0; i< inputArrayLength; i++)
        {
            int count = 0;
            for (int j = 0 ; j<inputArrayLength;j++)
            {
                if ( j != i && nums[j]<nums[i])
                {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
