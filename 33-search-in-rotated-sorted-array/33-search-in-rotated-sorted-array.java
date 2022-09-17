class Solution {
    public int search(int[] nums, int target) {
        int fix = nums[0];
        int n = nums.length;
        
        if(target < fix){
            int right  = n-1;
            while(true){
            if(right >= 0 && target == nums[right]){
                    return right;
                }
                
                if( right< 0 || nums[right]  < target){
                      return -1;
                }
                right--;
            }
        }else if(target > fix){
            int left =1; 
            while(true){
              if(left<=n-1 && nums[left] == target){
                  return left;
              }
            if(left > n -1 || nums[left] > target){
                return -1;
            }
                left++;
            }
            
        }else{
            if(target == fix){
                return 0;
            }
                
        }
        return -1;
    }
}