class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n < 4){
            return false;
        }
        for(int right =1; right < n-1; right++){
            for(int left =n-2; left>=2;left--){
                if( right < left && strI(nums,0, right) == true && strD(nums,right, left) == true 
            && strI(nums, left, n-1) == true){
                return true;
            }
            }
        }
        
        return false;
    }
    public boolean strI(int[] arr, int s, int e){
        int n = arr.length;
        for(int i =s; i<e; i++){
            if(arr[i] >= arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public boolean strD(int[] arr, int s, int e){
        int n = arr.length;
        for(int j = s; j<e; j++){
            if(arr[j] <= arr[j+1]){
                return false;
            }
        }
        return true;
    }


}