class Solution {
    public static void reverse(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end --; 
            
		} 
	}
    public void rotate(int[] a, int d) {
         d %=a.length;
        
        reverse(a, 0, a.length-1);
        reverse(a, 0, d-1);
        reverse(a,d, a.length-1);

    }
}