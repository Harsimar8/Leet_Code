class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(!mpp.containsKey(sorted)){
                mpp.put(sorted, new ArrayList<>());
            }
            mpp.get(sorted).add(s);
          
        }
        return new ArrayList<>(mpp.values());

    }
}