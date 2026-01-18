import java.util.*;
class Solution {
    public String largestNumber(int[] nums) {
        String[] numS = new String[nums.length];
        for(int i =0; i<nums.length; i++){
            numS[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numS, (a,b) -> (b+a).compareTo(a+b));
        if(numS[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String a : numS){
            sb.append(a);
        }
        return sb.toString();
    }
}