class Solution {
    public int maxProfit(int[] a) {
        int min = a[0];
        int maxProfit= 0;
        int profit= 0;
        for(int i = 0 ; i < a.length; i++){
            min = Math.min(min , a[i]);
            profit=a[i]- min;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}