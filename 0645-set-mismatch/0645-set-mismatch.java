import java.util.HashSet;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        int duplicate = -1;
        
        HashSet<Integer> seen = new HashSet<>();
        
        // Find the duplicate and calculate the actual sum
        for (int num : nums) {
            if (seen.contains(num)) {
                duplicate = num;  // This is the duplicate number
            }
            seen.add(num);
            actualSum += num;
        }
        
        // The missing number is the difference between the expected sum and the actual sum, adjusted for the duplicate
        int missing = expectedSum - (actualSum - duplicate);
        
        return new int[]{duplicate, missing};
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 2, 4};
        int[] result1 = solution.findErrorNums(nums1);
        System.out.println("Duplicate: " + result1[0] + ", Missing: " + result1[1]);
        
        int[] nums2 = {1, 1};
        int[] result2 = solution.findErrorNums(nums2);
        System.out.println("Duplicate: " + result2[0] + ", Missing: " + result2[1]);
    }
}
