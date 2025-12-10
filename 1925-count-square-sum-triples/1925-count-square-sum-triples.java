class Solution {
    public int countTriples(int n) {
        int cnt =0;
        for(int i =1; i<=n; i++){
            for(int j =1;j <=n; j++){
                for(int k =1; k<=n; k++){
                    if(isValid(i,j,k)){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    public boolean isValid(int i, int j, int k){
        int a = i *i;
        int b =j *j;
        int c = k *k;
        if(a + b == c){
            return true;
        }
        return false;
    }
}