class Solution {
    
     // normal sum 
        
        static int normal(int[] nums){
            
            int res = nums[0];
            int maxEnd = nums[0];
            for(int i = 1 ; i < nums.length; i++){
                maxEnd = Math.max(maxEnd + nums[i], nums[i]);
                res =  Math.max(maxEnd , res);
            }
            return res;
        }
    public int maxSubarraySumCircular(int[] nums) {
     
        int normalSum = normal(nums);
        if(normalSum < 0){
            return normalSum;
        }
        
        int arrSum = 0;
        for(int i = 0; i < nums.length; i++){
            arrSum += nums[i];
            nums[i] = - nums[i];
        }
        
         int maxCircularSum = arrSum + normal(nums);
        return Math.max(normalSum , maxCircularSum);
        
       
    }
}