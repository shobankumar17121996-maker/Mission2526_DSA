package Arrays.Assignments.Easy;

import java.util.Arrays;

public class ShuffledArray
{
    public static void main(String[] args) {
        int[] numbersArray = {2,3,4,5,6,7};
        int n = 3;
        System.out.println(Arrays.toString(Shuffle(numbersArray,n)));
        System.out.println(Arrays.toString(Shuffle2(numbersArray,n)));
    }
    // Optimized solution (o ms)
    public static int[] Shuffle(int[] numbers, int n)
    {
        int[] shuffledArr = new int[numbers.length];
        var beginIndex = 0;

        for (var i = 0; i < numbers.length; i++){
            if (i % 2 == 0){
                shuffledArr[i] = numbers[beginIndex];
                beginIndex++;
            }
            else {
                shuffledArr[i] = numbers[n];
                n++;
            }
        }
        return shuffledArr;
    }
    //Optimized solution (o ms)
    public static int[] Shuffle2(int[] numbers, int n)
    {
        int[] resArray = new int[numbers.length];
        int i = 0; //beginIndex
        int j = n; //secondSetBeginIndex
        for(int k = 0; k<numbers.length; k++)
        {
            resArray[k] = numbers[i]; i++;
            resArray[++k] = numbers[j]; j++;
        }
        return resArray;
    }
}
