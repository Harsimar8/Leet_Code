class Solution {
    public boolean isPalin(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> res = new ArrayList<>();
        helper(0,s,ans,res);
        return ans;
    }
    public void helper(int index , String s,List<List<String>> ans,List<String> res){
        if(index == s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i = index; i<s.length(); i++){
            if(isPalin(s,index,i)){
                res.add(s.substring(index, i +1));
                helper(i+1,s,ans,res);
                res.remove(res.size() -1);
            }
        }
    }
}