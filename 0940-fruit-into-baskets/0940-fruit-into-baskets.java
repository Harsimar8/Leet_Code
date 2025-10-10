class Solution {
    public int totalFruit(int[] fruits) {
        int maxi = Integer.MIN_VALUE;
        int left = 0;
        int n = fruits.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int right = 0; right<n; right++){
            mpp.put(fruits[right], mpp.getOrDefault(fruits[right],0)+1);
            while(mpp.size() > 2){
                mpp.put(fruits[left], mpp.get(fruits[left]) -1);
                if(mpp.get(fruits[left]) == 0){
                    mpp.remove(fruits[left]);
                }
                left++;
            }
            maxi = Math.max(maxi, right - left + 1);
        }
        return maxi;
    }
}