class Solution {
    public boolean rotateString(String s, String goal) {
        String s3 = s + s;
        int l1 = s.length();
        int l2 = goal.length();
        if(l1 != l2){
            return false;
        }
        if(s3.contains(goal)){
            return true;
        }
        else{
            return false;
        }
    }
}