package Arrays.Assignments.Easy;
import java.util.ArrayList;
import java.util.List;
public class KidsWithGreatestCandies
{
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        for (Boolean res:KidsWithCandiesOptimized(candies,3)
             ) {
            System.out.println(res);
        }

    }
    public static List<Boolean> KidsWithCandies(int[] candies, int extraCandies)
    {
        //two pointer method
        //one is to iterate through the candies count
        //second one is to iterate and sumup with extra candies

        //the below approach is having the highest time complexity

        int kidsCount = candies.length;
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int i = 0;i<candies.length;i++) {
            result.add(false);
        }
        for(int i = 0; i<kidsCount; i++)
        {
            int candyCount = candies[i]+extraCandies;
            for(int j = 0; j< kidsCount; j++)
            {
                if(candyCount>=candies[j])
                {
                    result.set(i,true);
                }
                else {
                    result.set(i,false);
                    break;
                }
            }
        }
        return result;
    }

    public static List<Boolean> KidsWithCandiesOptimized(int[] candies, int extraCandies)
    {
        int n = candies.length;
        ArrayList<Boolean>list = new ArrayList<>();

        int max = candies[0];
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max= candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max<=candies[i]+extraCandies){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
