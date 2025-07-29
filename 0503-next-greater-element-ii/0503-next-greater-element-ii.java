class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        int[] wae = new int[n*2];
        for(int i =0; i<n; i++){
            wae[i] = nums[i];
            wae[i + n] = nums[i];
        }
        for(int i = 0; i<n; i++){
            int elem = nums[i];
            boolean flag = false;
            int ans =-1;
            for(int j =i+1; j<wae.length; j++){
                if(wae[j] > elem){
                    ans = wae[j];
                    flag = true;
                    break;
                }
            }
            
                res[i] = ans;
            
            
        }
        return res;
    }
}