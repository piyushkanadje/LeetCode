class Solution {
    public int reverse(int x) {
        if(x==0) return 0;
        int rev = 0;
        int temp =  x;
        while(temp!=0){
       int ld= temp %10;
              if(rev>(Integer.MAX_VALUE/10)  || rev <(Integer.MIN_VALUE)/10 )
                return 0;
            rev = rev *10 + ld;
            temp= temp/10;
            
        }
      
        return rev;
    }
}

 /*  if(sum>(INT_MAX/10) || sum<(INT_MIN)/10) 
        {
            return 0;
        } */