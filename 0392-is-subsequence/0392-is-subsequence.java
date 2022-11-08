class Solution {
    public boolean isSubsequence(String s, String t) {
       
        int j = 0;
        int n = s.length();
        int m = t.length();
        
        if(m < n) return false;
        for(int i = 0; i < m && j < n ;i++){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
        }
        return (j==n);
    }
}