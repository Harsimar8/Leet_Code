class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxL = 0;
        int left = 0;
        int[] arr = new int[128]; 

        for (int right = 0; right < n; right++) {
            if (arr[s.charAt(right)] != 0) {
                left = (left > arr[s.charAt(right)]) ? left : arr[s.charAt(right)];
            }
            arr[s.charAt(right)] = right + 1;
            maxL = (maxL > right - left + 1) ? maxL : right - left + 1;
        }

        return maxL;
    }
}