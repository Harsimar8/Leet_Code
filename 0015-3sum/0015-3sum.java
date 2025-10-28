class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        for(int i =0; i<n-2;i++){
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n -1;
            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    left++;
                }
                else if(sum > 0){
                    right--;
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    
                    ans.add(list);
                    while(left < right && nums[left] == nums[left +1]){
                        left++;
                    }
                    
                    left++;
                    right--;

                }
            }
        }
        return ans;
    }
}