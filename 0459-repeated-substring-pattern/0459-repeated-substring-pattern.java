class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        System.out.println(str);
		String str1=str.substring(1, str.length()-1); 
          System.out.println(str1);
		if(str1.contains(s)) 				
			return true;
		else
		   return false;
    }
}