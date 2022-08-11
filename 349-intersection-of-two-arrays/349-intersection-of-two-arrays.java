class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> s = new HashSet<>();
        for(int i = 0 ;i< nums1.length;i++){
           s.add(nums1[i]);
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i =  0 ;i< nums2.length; i++){
            if(s.contains(nums2[i])){
                ls.add(nums2[i]);
                s.remove(nums2[i]);
            }
        }
        int[]a = new int[ls.size()];
        for(int i = 0;i< ls.size(); i++){
            a[i] = ls.get(i);
        }
    return a;
    }
}