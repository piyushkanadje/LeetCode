class Solution {
    public int pivotIndex(int[] a) {
        int n =a.length;
        int sum = 0;
        for(int i = 0;i<n ;i++){
            sum+=a[i];
        }
        
        int l = 0;
        for(int i = 0;i<n;i++){
            if(l==sum-a[i]){
                return i;
            }
            l +=a[i];
            sum-=a[i];
            
        }
        return -1;
    }
}