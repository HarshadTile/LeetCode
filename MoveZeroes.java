class Solution {
    public void moveZeroes(int[] nums) {
        int cnt =0;
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[cnt] = nums[i];  
                cnt++;  
            }
        }

        while (cnt < nums.length) {
            nums[cnt] = 0;
            cnt++;
        }
       
    }
}
