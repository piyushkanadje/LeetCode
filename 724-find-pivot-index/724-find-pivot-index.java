class Solution {
    public int pivotIndex(int[] nums) {
         int sum = 0;
        for(int i  =  0; i< nums.length; i++){
            sum+=nums[i];
        }
        
        int lastSum = 0;
        
        for(int i  = 0 ; i < nums.length; i++){
            
            if(lastSum == sum-nums[i]){
                return i;
            }
            
            lastSum += nums[i];
            sum -=nums[i];
        }
        
      return -1;
        
        
    }
}