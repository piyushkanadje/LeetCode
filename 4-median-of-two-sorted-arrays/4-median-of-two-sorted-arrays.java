
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          
	  int m = nums1.length;
      int n = nums2.length;
      int [] arr = new int[m+n];
      for(int i = 0; i < m ; i++){
          arr[i] = nums1[i];
      }
      for(int i = 0 ; i < n;i++){
    	  
          arr[m+i] = nums2[i];
        
          
      }
      Arrays.sort(arr);
        
        int low = 0;int high =  arr.length -1;
        
        int mid=(low + high)/2;
        if(arr.length %2 == 0){
            return (double)(arr[mid] + arr[mid+1])/2;
        }
        return arr[mid];

    }
}