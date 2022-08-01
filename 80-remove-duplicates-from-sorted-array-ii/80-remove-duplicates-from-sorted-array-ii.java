class Solution {
    public int removeDuplicates(int[] a) {
        int n=a.length;
        int currentElement = a[0];
        int currentCount = 1;
        int left =1;
        for(int i = 1;i<n ;i++){
            int loopEle =a[i];
            if(loopEle != currentElement){
                a[left] = loopEle;
                left++;
                currentElement = loopEle;
                currentCount=1 ;
                continue;
            }
            if(currentCount >= 2){
                continue;
            }
            a[left] = loopEle;
            left++;
            currentCount++;
        }
        return left;
    }
}