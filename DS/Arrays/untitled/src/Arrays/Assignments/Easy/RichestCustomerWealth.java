package Arrays.Assignments.Easy;

public class RichestCustomerWealth
{
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{4,5,6},{7,3,2},{4,3,2}};
        System.out.println("Richest Customer Wealth: "+RichestWealth(accounts));
    }
    public static int RichestWealth(int[][] accounts)
    {
        int maxWealth = 0;

        for (int[] account : accounts) {
            int sumOfWealth = 0;
            for (int j = 0; j < account.length; j++) {
                sumOfWealth += account[j];
            }
            if (sumOfWealth >= maxWealth) {
                maxWealth = sumOfWealth;
            }
        }
        return maxWealth;
    }
}
