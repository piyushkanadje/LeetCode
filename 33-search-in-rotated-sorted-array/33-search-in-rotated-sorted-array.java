class Solution {
    
    /*n: The pivot always will be in the 0 index.
if target is greather than pivot we will search from 1 index
if target is less than pivot we will search from n-1 index. */
    public int search(int[] nums, int target) { 
    
       int fix = nums[0];
       int n = nums.length;
    
        
        if(target <fix){
            int right = n -1;
            while(true){
                if(right >= 0 && target == nums[right]){
                    return right;
                }
                
                if(right < 0 || nums[right] < target){
                    return -1;
                }
                right -- ;
            }
        }
        
 else if(target > fix){  
         int left  = 1;
            
            while(true){
            if(left<=n-1  && target == nums[left]){
                return left;
            }
                if(left >= n || target < nums[left]){
return -1;
            }
            left ++; 
            }
             
         }else if(target == fix){

 return  0 ; }
        
return -1;
    
    }
}