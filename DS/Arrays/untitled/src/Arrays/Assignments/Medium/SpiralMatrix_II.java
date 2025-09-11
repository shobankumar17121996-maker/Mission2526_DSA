package Arrays.Assignments.Medium;

import java.util.Arrays;

public class SpiralMatrix_II {

    public static void main(String[] args) {
        int n = 3;
        for (int[] spiral: SpiralOrder(n)) {
            System.out.println(Arrays.toString(spiral));
        }

    }
    public static int[][] SpiralOrder(int n)
    {
        int[][] resultArray = new int[n][n];
        int rowBeg=0,colBeg = 0;
        int rowEnd=n-1,colEnd = n-1;
        int resultElement = 1;
        while(rowBeg<=rowEnd && colBeg<=colEnd)
        {
            //traverse left to right colBeg -> ColEnd in rowBeg
            //once done increment the rowBeg to next row
            for(int i = colBeg; i<=colEnd; i++)
            {
                resultArray[rowBeg][i] = resultElement++;
            }
            rowBeg++;

            //traverse top to bottom rowBeg -> rowEnd in colEnd
            //once done decrement the colEnd to previous column(-1)
            for(int i = rowBeg; i<=rowEnd; i++)
            {
                resultArray[i][colEnd] = resultElement++;
            }
            colEnd--;

            //traverse from right to left colEnd -> colBeg in rowEnd
            //once done decrement the rowEnd to shift up by -1
            if(colBeg<=colEnd)
            {
                for(int i = colEnd; i>=colBeg; i--)
                {
                    resultArray[rowEnd][i] = resultElement++;
                }
            }
            rowEnd--;

            //traverse from bottom to top rowEnd to rowBeg in colBeg
            //once done increment the colBeg by 1
            if(rowBeg<=rowEnd)
            {
                for(int i = rowEnd; i>=rowBeg; i--)
                {
                    resultArray[i][colBeg] = resultElement++;
                }
            }
            colBeg++;
        }
        return resultArray;
    }
}

