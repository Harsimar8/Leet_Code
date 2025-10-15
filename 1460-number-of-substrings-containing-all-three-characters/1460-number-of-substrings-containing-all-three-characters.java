class Solution {
    public int numberOfSubstrings(String s) {
     char[] ch = s.toCharArray();
     int n = ch.length;
     int right = 0;
     int cnt =0;
     int left =0;
     HashMap<Character,Integer> mpp = new HashMap<>();
     while(right < n){
        mpp.put(ch[right],mpp.getOrDefault(ch[right],0)+1);
        while(mpp.size() == 3){
            cnt += n -right;
            
            mpp.put(ch[left], mpp.get(ch[left])-1);
            if(mpp.get(ch[left]) == 0){
                mpp.remove(ch[left]);
            }
            left++;

        }
        right++;
     }   
     return cnt;
    }
}