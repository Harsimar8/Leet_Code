class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> mpp = new HashMap<>();
        mpp.put('2',"abc");
        mpp.put('3',"def");
        mpp.put('4',"ghi");
        mpp.put('5',"jkl");
        mpp.put('6',"mno");
        mpp.put('7',"pqrs");
        mpp.put('8',"tuv");
        mpp.put('9',"wxyz");
        List<String> ans = new ArrayList<>();
        ans.add("");
        char[] arr = digits.toCharArray();
        for(char c : arr){
            String ff = mpp.get(c);
            List<String> temp = new ArrayList<>();
            for(char bb : ff.toCharArray()){
                
                for(String ss : ans){
                    temp.add(ss + bb);
                }
                
            }
            ans  = temp;
            
        }  
        return ans;
    }
}