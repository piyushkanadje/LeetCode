class Solution {
    public int kthSmallest(int[][] matrix, int k) {
      int row=matrix.length;
        int colum=matrix[0].length;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<row;i++){ 
            for(int j=0;j<colum;j++){
            pq.add(matrix[i][j]);     
          } 
        }                
        int a=0;             
        while(k-->0){        
            a=pq.remove();   
        }
        return (a);
    }
}