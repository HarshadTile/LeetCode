import java.util.Arrays;
class MissingNumber {
    public int missingNumber(int[] nums)
    {

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            for(int j= i;j<nums.length;j++)
            {
                if(nums[i]!=j)
                {
                    return j;
                }
                break;
            }
        }
        return nums.length; 
        
    }
}
