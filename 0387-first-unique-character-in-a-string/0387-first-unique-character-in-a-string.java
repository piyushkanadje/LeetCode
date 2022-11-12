class Solution {
    
    static final int CHAR = 256;
    public int firstUniqChar(String s) {
       int[] count = new int[CHAR];
        for(int i= 0 ; i < s.length() ;i++){
            count[s.charAt(i)] ++;
        }
        
        for(int i = 0; i <s.length(); i++){
            if(count[s.charAt(i)] == 1){
                return i;
            }
        }
        
        return -1;
    }
}