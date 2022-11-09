class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
       List<List<Integer>> list = new ArrayList<>();
       
       generateSubset(list, new ArrayList<Integer>(),nums,0);
        
       return list; 
        
    }
    
    
    public void generateSubset( List<List<Integer>> list, List<Integer> ans , int[] nums, int index){
  
        //add current subset in the list
        
        list.add(new ArrayList<>(ans));
        
        for(int i = index; i < nums.length;i++){
            
            ans.add(nums[i]);
            
            generateSubset(list, ans, nums, i + 1);
            
            ans.remove(ans.size() - 1);
            
        }
        
    }
}