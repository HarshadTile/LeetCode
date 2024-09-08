public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Otherwise, set the current digit to 0
            digits[i] = 0;
        }
        
        // If all the digits were 9, create a new array with an extra digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        
        return newNumber;
    }
}
