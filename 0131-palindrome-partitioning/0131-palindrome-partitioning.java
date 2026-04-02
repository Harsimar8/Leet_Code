class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>> res = new ArrayList<>();
       List<String> ans = new ArrayList<>();
       helper(s,res, ans, 0,s.length());  
       return res;
    }
    public void helper(String s, List<List<String>> res, List<String> ans, int i, int n){
        if(i == n){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int k =i; k<n; k++){
            if(isPalind(s, i,k)){
                ans.add(s.substring(i,k+1));
                helper(s, res,ans,k+1, n);
                ans.remove(ans.size() -1);
            }
        }
    }
    public boolean isPalind(String s, int left, int right){
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}