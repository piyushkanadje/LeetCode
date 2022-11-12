class Solution {
    
    static final int CHAR = 256;
    public char repeatedCharacter(String s) {
     int[] count =new int[CHAR];
        for(int i = 0 ; i< s.length();i++){
           count[s.charAt(i)]++;
            if(count[s.charAt(i)] == 2){
                return (char) s.charAt(i);
            }
            }
        
//         for(int i = 0  ; i < s.length();i++){
            

//           if(count[s.charAt(i)] == 2 && (char) s.charAt(i) == (char) s.charAt(i+1) ){
              
              
//               return (char) s.charAt(i);
//           }  
//         }

       return ' ';  
    }
}