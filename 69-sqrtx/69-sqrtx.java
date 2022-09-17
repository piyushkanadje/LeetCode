class Solution {
    public int mySqrt(int x) {
        long low = 0; long high = x; 
		long ans = 0;
		while(low<= high) {
			long  mid = (low+ high)/2;
			long midsq =  mid * mid;
			if(midsq == x) {
				return (int)mid;
			}else if(midsq > x ) {
				high =  mid -1;
			}else {
				low = mid +1;
				ans = mid;
			}
		}
		return (int) ans;
	}
}