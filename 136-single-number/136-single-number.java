class Solution {
    public int singleNumber(int[] nums) {
       HashSet<Integer>  hs  = new HashSet<Integer>(nums.length);
        
        for(int  i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])){
                  hs.remove(nums[i]);
            }else{
                hs.add(nums[i]);
            }
        }
     Iterator<Integer> i = hs.iterator();

        return i.next();
    }
}