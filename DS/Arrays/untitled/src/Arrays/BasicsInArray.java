package Arrays;

import java.util.Scanner;

public class BasicsInArray {
    public static void main(String[] args) {
        System.out.println("Let's learn about arrays");
        System.out.println("syntax");
        Scanner in = new Scanner(System.in);

        // arrays initialization
        int[] arr; // Declaration, Compile time : creates variable arr in the stack memory
        arr = new int[5]; // initialization, Run time: Creates memory space for the array during runtime in heap memory

        //or we can directly write array in two ways
        //1
        int[] arr1 = new int[5];
        String[] strArr = new String[3];

        //2
        int[] arr2 = {1,2,3,4,5};
        String[] strArr1 = {"Shoban", "Kumar", "CEO"};
        System.out.println(java.util.Arrays.toString(arr2));
        System.out.println(java.util.Arrays.toString(strArr1));

        //Inserting Values in array during runtime
//        int[] runtimeAcceptArrays = new int[5];
//        for (int i = 0; i < runtimeAcceptArrays.length; i++) {
//            runtimeAcceptArrays[i] = in.nextInt(); // input: 1 2 3 4 5 6 7 8 9
//        }

        //Output: Printing values from an array
//        System.out.print("[");
//        for (int i = 0; i < runtimeAcceptArrays.length; i++) {
//            if (i == runtimeAcceptArrays.length-1)
//            {
//                System.out.print(runtimeAcceptArrays[i]);
//            }
//            else
//            {
//                System.out.print(runtimeAcceptArrays[i] + ", ");
//            }
//        }
//        System.out.print("]");
//        PrintArrays(runtimeAcceptArrays);
//        System.out.println();
//        System.out.println(java.util.Arrays.toString(runtimeAcceptArrays)); //output: 1 2 3 4 5 6


        //Mutability of Arrays : Ability to change and retain the changes in the same memory allocation in runtime. also called as Dynamic Memory Allocation
        int[] mutArr = {1,2,3,4,5};
        PrintArrays(mutArr);    //output: [1,2,3,4,5]
//        mutArr[2] = 4;
//        System.out.println();
//        PrintArrays(mutArr);
//        now we will create a method which will change the array object values and print the values
        //Here we will update the 4th index with value 115 in the following method
        ChangeArrayObject(mutArr); // array value changed into [1,2,3,115,5]
        PrintArrays(mutArr); //output: [1,2,3,115,5]


    }
    private static void PrintArrays(int[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
    }
    private static void ChangeArrayObject(int[] arr)
    {
        arr[3] = 115;
    }
}
