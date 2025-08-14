class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;
        
        for(int i =0; i<n;i++){
             if(i>0 && nums[i] == nums[i-1]){continue;}
            int k = n-1;
            for(int j = i+1; j<n; j++){
                if(j>i+1 && j < n-1 &&  nums[j] == nums[j-1] ){continue;}
                List<Integer> sublist = new ArrayList<>();
                if(j>=k){
                    break;
                }
                if(nums[i] + nums[j] + nums[k] == 0){
                    sublist.add(nums[i]);
                    sublist.add(nums[j]);
                    sublist.add(nums[k]);
                    
                    list.add(sublist);
                    k--;
                    
                    
                }
                else if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                    j--;
                }
                while( k < n-1 && k > 0 &&  nums[k] == nums[k+1]){
                    k--;
                }
            }
            if(i == k){
                break;
            }
        }
        return list;
    }
}