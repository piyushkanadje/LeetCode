class Solution {
    public boolean isValid(String s) {
        if(s.length() %2 !=0) return false;
        
        Stack<Character> sq = new Stack();
        
        for(char c : s.toCharArray()){
            if(c== '(' || c == '{' || c == '['){
                sq.push(c);
            }else if( c == ')' && !sq.isEmpty() && sq.peek() == '(' ){
                sq.pop();
            }
            else if( c == '}' && !sq.isEmpty() && sq.peek() == '{' ){
                sq.pop();
            }else if( c == ']' && !sq.isEmpty() && sq.peek() == '[' ){
                sq.pop();
            }else{
                return false; //when cases like }}, )), ([}}]) this will 
            }  //stack.push(c)
        }
        return sq.isEmpty();
    }
}