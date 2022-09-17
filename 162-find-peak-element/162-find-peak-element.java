class Solution {
    public int findPeakElement(int[] nums) {
       int low =0 ; int high = nums.length -1;
        int n = nums.length;
        while(low <= high){
        int mid =(low + high)/2;
            
            // condition apply for corner element
         if((mid ==  0  ||  nums[mid] >= nums[mid-1]) && (mid == n-1 || nums[mid] >= nums[mid+1])) {
             return mid;
         }
            
            if(mid> 0 && nums[mid-1] >= nums[mid]){
            high =  mid -1;
            }else{

         low = mid+1;
            }
        }
        return -1;
    }
}