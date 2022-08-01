class Solution {
    public int maximumDifference(int[] nums) {
       int output = -1;
        int min = nums[0];
        for(int i = 1;i< nums.length; i++){
            if(min < nums[i]){
                output= Math.max(output, nums[i]-min);
            }else{
              min= nums[i];
            }
        }
        return output;
    }
}