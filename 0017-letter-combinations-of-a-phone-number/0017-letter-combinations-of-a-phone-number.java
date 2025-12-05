class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character,String> mpp = new HashMap<>();
        mpp.put('2',"abc");
        mpp.put('3',"def");
        mpp.put('4',"ghi");
        mpp.put('5',"jkl");
        mpp.put('6',"mno");
        mpp.put('7',"pqrs");
        mpp.put('8',"tuv");
        mpp.put('9',"wxyz");

        ans.add("");
        char[] arr = digits.toCharArray();
        for(char digit : arr){
            String letter = mpp.get(digit);
            List<String> temp = new ArrayList<>();
            for(String s : ans){
                for(char c : letter.toCharArray()){
                    temp.add(s + c);
                }
            }
            ans = temp;
        } 
        return ans;
    }
}