class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, String> mpp = new HashMap<>();
        mpp.put('2',"abc");
        mpp.put('3', "def");
        mpp.put('4', "ghi");
        mpp.put('5', "jkl");
        mpp.put('6',"mno");
        mpp.put('7', "pqrs");
        mpp.put('8', "tuv");
        mpp.put('9',"wxyz");

        ans.add("");
        for(char c : digits.toCharArray()){
            String ff = mpp.get(c);
             List<String> temp = new ArrayList<>();
            for(char p : ff.toCharArray()){

                for(String o : ans){
                    temp.add(o + p);
                }
                
            }
            ans = temp;
        }
        return ans;
    }
}