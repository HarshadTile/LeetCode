class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each element
        for (int i = 0; i < nums.length; i++) {
            // Loop through the remaining elements after the current element
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the two elements equals the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices as an array
                    return new int[] { i, j };
                }
            }
        }
        // Return null if no solution is found
        return null; 
    }
}
