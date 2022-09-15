class Solution {
    public int removeDuplicates(int[] a) {
        int res  =  1 ;
         for(int  i  = 0 ;i< a.length; i++){
             if(a[res -1] != a[i]){
                a[res] = a[i];
                 res++;
             }
         }
        return res;
    }
}