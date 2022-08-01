class Solution {
    public int removeDuplicates(int[] a) {
        int n =a.length;
        int res= 1;
        for(int i = 0; i<n ;i++){
if(a[res-1] != a[i]){
    a[res] =a[i];
    res++;
}
        }
        return res;
    }
}