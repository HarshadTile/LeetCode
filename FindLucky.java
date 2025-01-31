class FindLucky {
    public int findLucky(int[] arr) {

        boolean[] visited = new boolean[arr.length]; // Step 1: Create visited array
        int maxLucky = -1; // Step 2: Track the largest lucky integer

        for (int i = 0; i < arr.length; i++) { // Step 3: Outer loop to pick each number
            if (visited[i]) continue; // Skip already counted numbers

            int count = 1; // Start counting occurrences
            for (int j = i + 1; j < arr.length; j++) { // Step 4: Inner loop to count occurrences
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // Mark counted numbers
                }
            }

            // Step 5: Check if the number is lucky (frequency == value)
            if (count == arr[i]) {
                maxLucky = Math.max(maxLucky, arr[i]); // Keep track of the largest lucky number
            }
        }

        return maxLucky; // Step 6: Return the largest lucky integer (or -1 if none)
        
    }
}
