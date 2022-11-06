class Solution {
    public int longestContinuousSubstring(String s) {
        ArrayList<Character> arr =  new ArrayList<>();
        for(char c : s.toCharArray()){
            arr.add(c);
        }
        
        if(s.length() ==1){
            return 1;
        } 
        int streak = 0;
          int curr =  arr.get(0);
          int currStreak = 1;
        
        int i  = 1;
            while(i < s.length()){
            if(((int)arr.get(i) - 1 == (int)arr.get(i-1))){
         currStreak++;
                
            }else{
                currStreak=1;
            }
                  streak = Math.max(currStreak, streak);
                i++;
            }
    
       
        return streak;
    }
}