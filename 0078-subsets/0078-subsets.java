class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
//         //Answer of the question in lisy
//          List<List<Integer>> ans  = new ArrayList<>();
//         //Function to generate subsets
//       Arrays.sort(nums);
//         generateSubset(ans , new ArrayList<Integer>(), nums, 0);
        
//         return ans;
          List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> tempList ,int[] nums, int start){
//         //add current subset in the  ans
//         ans.add(new ArrayList<>(output));
//         //iterate  for every element in subset and and create powerset using everu
//         for(int i = index; i < nums.length;i++){
//             //Add current element in the subset and generate subset using that number
//             output.add(nums[i]);
//             //including the number
//             generateSubset(ans,output,nums,index + 1);
//             // excluding the number
//             output.remove(output.size() - 1 ); 
//         }
        list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
    }
    
    
}