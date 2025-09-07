package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TwoDimensionalArray
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] twoDArrayExample = {{1,2,3},{2,6},{3,4,5,6}};
        for (int[] arr: twoDArrayExample) {
            System.out.println(Arrays.toString(arr));
        }

        int[][] twoDim_array = new int[2][];



        //Declaration and initialization
        int[][] twoD_Array = new int[3][3]; // mentioning the row size is mandatory

//        //Declaration
//        int[][] multiD_Arrays;
//
//        //Initialization
//        multiD_Arrays = new int[3][];

        //Receiving input : To receive input in runtime, Two Dimensional arrays must be mentioned explicitly with column size as well
//        for (int row = 0; row < twoD_Array.length; row++)
//        {
//            for(int col = 0; col< twoD_Array[row].length; col++)
//            {
//                twoD_Array[row][col] = input.nextInt();
//            }
//        }
//
//        //Printing the values
//        for(int row =0; row< twoD_Array.length; row++)
//        {
//            System.out.println(java.util.Arrays.toString(twoD_Array[row]));
//        }
    }
}
