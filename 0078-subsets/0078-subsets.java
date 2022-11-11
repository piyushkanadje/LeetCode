class Solution {
      public List<List<Integer>> subsets(int[] ns) {
        List<List<Integer>> acc = new ArrayList<>();
        
        recur(acc, ns, new Stack<>(), 0);
        return acc;
    }
    
    private void recur(List<List<Integer>> acc, int [] ns, Stack path, int start){
        if(ns.length == start){
            acc.add(new ArrayList<>(path));
            return;
        }
            
        // take ns[start]
        path.push(ns[start]);
        recur(acc, ns, path, start + 1);
        path.pop();
        
        // dont take ns[start]
        recur(acc, ns, path, start + 1);
    }
}