class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count  = 1;
        
        //First Part is to find candidate 
        for(int  i  =1; i < nums.length; i++){
            if(nums[candidate] == nums[i]){
                count++;
            }else{
                count--;
            }
            if(count == 0 ){
                candidate =  i;
                count =1;
            }
        }
        
        int res = 0 ;
        //Second Part iS to verify the candidate
        for(int i  =0 ; i < nums.length; i++){
            if(nums[candidate] == nums[i]){
                res++;
            }
        }
        if(res > nums.length/2){
            return nums[candidate];
        }
        return -1;
    }
}