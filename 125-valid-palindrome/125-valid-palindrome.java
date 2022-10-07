class Solution {
    public boolean isPalindrome(String s) {
       String fixed_string = "";
        
        //create fixed string with alpha numeric and letter only
        for(char c :  s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixed_string +=c;
            }
        }
        
    // to lower case
        fixed_string =  fixed_string.toLowerCase();
        
        
    // iterate through string
         
        int first = 0;
        int last = fixed_string.length() - 1;
        
        while(first <= last){
            if(fixed_string.charAt(first) != fixed_string.charAt(last))             {
                return false;
                
            }
            first++;
            last--;
        }
        return true;
        
    }
}