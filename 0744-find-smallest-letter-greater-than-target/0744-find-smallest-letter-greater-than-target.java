class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int t = target - 'a';
        int mino = Integer.MAX_VALUE;
        for(char one : letters){
            int val = one - 'a';
            if(val > t){
                mino = Math.min(val, mino);
            }
        }
        return mino == Integer.MAX_VALUE ? letters[0] : (char)(mino + 'a');
    }
}