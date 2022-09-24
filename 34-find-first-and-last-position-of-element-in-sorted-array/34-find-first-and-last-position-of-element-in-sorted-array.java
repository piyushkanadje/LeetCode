class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a = first(nums,target);
        int b = last(nums,target);
        return new int[] {a,b};
    }
    
    
    public static int first(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid =  (low+high)/2; 
            
            if(nums[mid] > target){
                high = mid -1;
            }else if(nums[mid] < target){
               low = mid + 1;
            }else{
                if( mid == 0 || nums[mid] != nums[mid -1]){
                    return mid;
                }else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    public static int last(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid =  (low+high)/2; 
            
            if(nums[mid] > target){
                high = mid -1;
            }else if(nums[mid] < target){
               low = mid + 1;
            }else{
                if( mid == nums.length-1 || nums[mid] != nums[mid +1]){
                    return mid;
                }else{
                   low= mid+1;
                }
            }
        }
        return -1;
    }
}