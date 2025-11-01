class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0) +1);
        }
        int i =0;
        int[] arr= new int[2];
        for(int a : mpp.keySet()){
            if(mpp.get(a) == 2){
                int val =a;
                arr[i] = a;
                if(i<2){
                i++;}
            }
        }
        return arr;
    }
}