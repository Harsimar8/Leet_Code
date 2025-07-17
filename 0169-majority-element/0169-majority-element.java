class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ele = 0;
        int cnt =0;
        for(int i =0; i<n; i++){
            if(cnt ==0){
                ele =nums[i];
                cnt =1;
            }
            else if(nums[i] == ele){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1 =0;
        for(int i =0; i<n;i++){
            if(ele == nums[i]){
                cnt1++;
            }
            
        }
        if(cnt1 > n/2){
                return ele;
            }
            else{
                return -1;
            }
        
    }
}