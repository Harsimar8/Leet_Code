class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mpp = new HashMap<>();
        for(String ss : strs){
            char[] ch = ss.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!mpp.containsKey(sorted)){
                mpp.put(sorted, new ArrayList<>());
            }
            mpp.get(sorted).add(ss);
        }
        return new ArrayList<>(mpp.values());

    }
}