class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int right = nums.length-1; int left = 0;
        Arrays.sort(nums);
        while(left< right){
            if(nums[right] + nums[left] > k){
                right -- ;
            }else if(nums[right] + nums[left] < k){
                left++ ;
            }else{
                right -- ;
                left++;
                count++;
            }
        }
        return count;
    }
}