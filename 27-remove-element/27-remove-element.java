class Solution {
    public int removeElement(int[] a, int val) {
        int  n = a.length; 
        int res= 0; 
        for(int i = 0;i<n ;i++){
            if(a[i] != val){
            a[res] = a[i];
                res++;
            }
        }
        return res;
    }
}