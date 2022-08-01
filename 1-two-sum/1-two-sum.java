class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>map= new HashMap<>();
        for(int i =0;i<nums.length; i++){
        
            if(map.containsKey( target- nums[i])){

                return new int[] {map.get( target- nums[i]), i};
            } else{
               map.put(nums[i], i);
            }
        }
       throw new IllegalArgumentException("No Pair found");
    }
}