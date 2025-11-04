class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        for(int i =0; i<result.length;i++){
            result[i] = calculate(nums,i,i+k-1,x);
        }
        return result;
    }
    public int calculate(int[] nums, int s, int e, int x){
        int maxi = 50;
        int[] freq = new int[maxi+1];
        int total =0;
        int d = 0;
        for(int i =s;i<=e;i++){
            int num = nums[i];
            total += num;
            if(freq[num] == 0){
                d++;
            }
            freq[num]++;
        }
        if(d < x){
            return total;
        }
        int result =0;
        for(int f = 0; f<x; f++){
            int bestN =-1;
                int bestF = -1;
            for(int j = maxi; j>=1; j--){
                if(freq[j] > bestF){
                    bestF = freq[j];
                    bestN = j;
                }

            }
            if(bestF != -1){
                result += bestF * bestN;
                freq[bestN] = 0;
            }
        }
        return result;
    }
}