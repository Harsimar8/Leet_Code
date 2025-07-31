class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> list = new HashSet<>();
        int n = nums.length;
        int a = n/3;
        for(int i =0; i<n; i++){
            int cnt =0;
            int elem = nums[i];
            for(int j =0; j<n; j++){
                if(nums[j] == elem  ){
                    cnt++;
                }
            }
            if(cnt > a ){
                list.add(nums[i]);
            }
            if(list.size() == 2){
                break;
            }
        }
        List<Integer> ll = new ArrayList<>(list);
        return ll;
    }
}