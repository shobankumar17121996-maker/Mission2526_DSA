package Arrays.Assignments.Easy;

public class GoodPairs
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int res = identicalTwins(arr);
        System.out.println(res);
    }
    public static int identicalTwins(int[] nums)
    {
        int result=0;
        int count[]=new int[101];
        for(int i : nums){
            result += count[i]++;
        }
        return result;
    }
}
