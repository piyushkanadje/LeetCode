class Solution {
    public int maxSubArray(int[] a) {
       int n=a.length; int res =a[0] ; int maxEnd =a[0];
        for(int i = 1;i<n;i++){
            maxEnd =Math.max(maxEnd + a[i] , a[i]);
            res =Math.max(maxEnd, res);
        }
        return res;
    }
}