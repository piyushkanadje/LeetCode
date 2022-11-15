class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] sArr = s.split("\\s");
        if(sArr.length != pattern.length()) return false;
        HashMap<Character, String> map = new HashMap();
        for(int i = 0; i < pattern.length();i++){
            char current_char = pattern.charAt(i);
            if(map.containsKey(current_char)){
                if(!map.get(current_char).equals(sArr[i])){
                    return false;
                }
            }else{
                
                if(map.containsValue(sArr[i])){
                return false;
                }
                map.put(current_char , sArr[i]);
            }
        }
    return true;     
    }
}