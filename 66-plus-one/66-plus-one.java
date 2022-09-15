class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int n=digits.length-1;n>=0;n--){
            digits[n]=digits[n]+carry;
            carry=digits[n]/10;
            if(digits[n]>9){
                digits[n]%=10;
            }
        }
        if(carry>0){
            int[] result=new int[digits.length+1];
            result[0]=1;
            System.arraycopy(digits,0,result,1,digits.length);
            return result;
        }
        return digits;
    }
}