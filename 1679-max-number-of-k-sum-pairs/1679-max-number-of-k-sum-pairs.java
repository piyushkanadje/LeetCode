class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            int diff = k - num;
            
            if(map.containsKey(diff) && map.get(diff) > 0) {
                count++;
                map.put(diff, map.get(diff) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        
        return count;
    }
}