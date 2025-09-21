class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i =0; i<n; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }
        int[] arr = new int[2];
        int i =0;
        for(int a: mpp.keySet()){
            if(mpp.get(a) == 1){
                arr[i] = a;
                i++;
            }
        }
        return arr;
    }
}