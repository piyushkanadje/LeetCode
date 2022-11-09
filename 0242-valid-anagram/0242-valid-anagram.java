class Solution {
    public boolean isAnagram(String s, String t) {
      
        if(s.length() !=  t.length()){
            return false;
        }
        
        char a[] = s.toCharArray();
        Arrays.sort(a);
        String p =  new String(a);
        char b[] = t.toCharArray();
        Arrays.sort(b);
        String q=  new String(b);
        
        return p.equals(q);
    }
}