class Solution {
    public int dominantIndex(int[] nums) {

        int indexOfmax =0;
        int cnt =0;
        
        // int max = Collections.max(Arrays.asList(nums));
        int max = Arrays.stream(nums).max().getAsInt();
        // System.out.println(max);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
               indexOfmax = i;
            }
        }

        for(int i=0;i<nums.length;i++){
       
        if(nums[i] != max && nums[i] * 2 > max) {
        return -1;
    }
}
return indexOfmax;

        
            
       

        
        
        // if(cnt<nums.length){
        //     return indexOfmax;
        // }
        // else{
        //     return -1;
        // }
        
    }
}
