class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> cur = new ArrayList<>();
        int i=0;
        helper(i,cur,candidates,target);
        return ans;
    }
    public void helper(int i , List<Integer> cur, int[] arr, int sum){
        if(sum ==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        int n = arr.length -1;
        if(i == n){
            if(sum == arr[n]){
                cur.add(arr[i]);
                ans.add(new ArrayList<>(cur));
                cur.remove(cur.size()-1); 
            }
            else if(sum % arr[i] == 0){
                cur.add(arr[i]);
                helper(i,cur,arr,sum- arr[i]);
                cur.remove(cur.size() -1);
            }
            return;
        }
        helper(i+1,cur,arr,sum);
        if(arr[i] <= sum){
            cur.add(arr[i]);
            helper(i, cur,arr, sum - arr[i]);
            cur.remove(cur.size() -1);
        }
    }
}