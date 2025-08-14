class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        
                    
        for(int i =0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                        continue;
            }
            for(int j =i+1; j<n; j++){
            if(j > i+1 && nums[j] == nums[j-1]){
                        continue;
            }
                int l = n-1;
                for(int k= j+1; k<n; k++){
                    
                    if(k>=l){
                        break;
                    }
                    if(k > j+1 && nums[k] == nums[k-1]){
                        continue;
                    }
                    
                    List<Integer> sublist = new ArrayList<>();
                    
                        long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                        if( sum == target){
                        sublist.add(nums[i]);
                        sublist.add(nums[j]);
                        sublist.add(nums[k]);
                        sublist.add(nums[l]);
                        list.add(sublist);
                        l--;
                    
                        
                    }
                    else if(nums[i] + nums[j] + nums[k] + nums[l] > target){
                        l--;
                        k--;
                    }
                    
                   
                }
            }
        }
        return list;
    }
}