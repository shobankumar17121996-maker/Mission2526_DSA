package Arrays.Assignments.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
        List<Integer> integerResult = spiralOrder(matrix);
        System.out.print("[");
        for(int i: integerResult)
        {
            System.out.print(i+", ");
        }
        System.out.print("]");

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[rowBegin].length-1;

        //Traverse through all the rows and columns
        while (rowBegin<=rowEnd && colBegin<=colEnd)
        {
            //Traverse Right
                // when the column end is reached.
                    // increment rowBegin to next row
            for (int j = colBegin; j<=colEnd; j++)
            {
                result.add(matrix[rowBegin][j]);
            }
            rowBegin++;


            //Traverse Down
                // when the row end is reached
                    // decrement the colEnd
            for(int i = rowBegin; i<=rowEnd; i++)
            {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            //Traverse Left
                //check if the rowbegin and rowend indices are not intersecting
            if(rowBegin <= rowEnd)
            {
                for(int j = colEnd; j>=colBegin; j--)
                {
                    result.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;


            //Traverse up
            if(colBegin<=colEnd)
            {
                for(int i = rowEnd; i>= rowBegin; i--)
                {
                    result.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }

        return result;
    }
}
