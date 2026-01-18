class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        helper(ans,res, s,0);

        return ans;
    }
    public boolean isPalin(String s, int left , int right){
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void helper(List<List<String>> ans, List<String> res,String s, int index){
        if(index == s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int k = index; k<s.length(); k++){
            if(isPalin(s,index,k)){
                res.add(s.substring(index,k+1));
                helper(ans,res,s,k+1);
                res.remove(res.size() -1);
            }
        }
    }
}