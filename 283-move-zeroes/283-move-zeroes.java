class Solution {
    public void moveZeroes(int[] nums) {
       int insert = 0 ;        
        for (int i : nums){
            if(i !=0){
                nums[insert++] = i;
            }
        }        
        while(insert< nums.length){
            nums[insert++] = 0;
        }
    }
}