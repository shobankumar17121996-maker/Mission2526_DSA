package Arrays.Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInGivenOrder
{
    public static void main(String[] args) {
        int[] inputArray = {0,1,2,3,4};
        int[] targetIndices = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(inputArray,targetIndices)));
    }
    public static int[] createTargetArray(int[] inputArray, int[] targetIndices)
    {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i< inputArray.length;i++)
        {
            result.add(targetIndices[i],inputArray[i]);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
