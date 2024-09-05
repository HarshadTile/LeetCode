import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the array to enable two-pointer technique
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the current element i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Move the left pointer to increase the sum
                    left++;
                } else {
                    // Move the right pointer to decrease the sum
                    right--;
                }
            }
        }
        
        return result;
    }
}
