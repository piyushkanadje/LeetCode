class Solution {
    public int kthSmallest(int[][] matrix, int k) {
           int count = 0 ;
        int[] arr =  new int[matrix.length *  matrix.length];
        for(int i = 0; i< matrix.length ; i++){
  for(int j = 0; j< matrix.length ; j++){
    
       arr[count] = matrix[i][j];
        count++;

        
        } 
        
        }
        
        Arrays.sort(arr);
        return(arr[k-1]);
    }
}