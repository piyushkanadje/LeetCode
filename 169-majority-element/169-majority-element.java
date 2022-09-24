class Solution {
    public int majorityElement(int[] nums) {
       int candidate = 0 ;
       int count =1;
        for(int i=1 ;i< nums.length; i++){
         if(nums[i] == nums[candidate]){
             count++;

         }else{
             count -- ;
         }
            if(count == 0){
                candidate = i ;
                count =1;
            }
        }
        int n = nums.length;
        int res = 0;
        for(int i = 0;i < nums.length;i++){
         if(nums[i]== nums[candidate]){
         res++;
     }
            if(res > (n/2)){
            return nums[candidate];
        }
}
        
        return -1;
    }
}