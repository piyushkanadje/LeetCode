class Solution {
    
    //Kadens algorith
    public static int normalMax(int[] a){
        int n =a.length;
        int res =a[0]; int maxEnd = a[0];
        for(int i = 1;i< n ;i++){
            maxEnd  = Math.max(maxEnd +a[i] , a[i]);
            res = Math.max(res , maxEnd);
        }
        return res;
        
    }
    
    
    
    public int maxSubarraySumCircular(int[] a) {
         int n =a.length;
        int normalSum = normalMax(a);
        
        //check weather normal sum is less than  zero if yes return normal sum
        if(normalSum < 0){
            return normalSum;
        }
//arrSum is minimum sum of subarray
        int arrSum = 0;
        for(int i= 0 ;i< n ; i++){
          arrSum += a[i];
            a[i] = -a[i];
        }
        int maxCircularSum = arrSum + normalMax(a);
        return Math.max(normalSum , maxCircularSum);
    }
}