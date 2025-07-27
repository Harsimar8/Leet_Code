class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int res[] = new int[n1];
        for(int i =0; i<n1;i++){
            int elem = nums1[i];
           int ans = 0;
            for(int j =0; j<n2; j++){
                if(nums2[j] == elem){
                    
                    for(int k = j+1; k<n2; k++){
                        
                        if(nums2[k] > elem){
                            ans = nums2[k];
                            break;
                        }
                    }
                }
            }
            if(ans == 0){
                res[i] = -1;
            }
            else{
                res[i] = ans;
            }
            
        }
        
        return res;
    }
}