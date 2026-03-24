class Solution {
    public int reverse(int x) {
        int sum=0;
        while(x!=0){
            int dig = x%10;
            x/=10;
            if(Integer.MAX_VALUE/10 < sum || Integer.MIN_VALUE/10 > sum){
                return 0;
            }
            sum=(sum*10)+dig;
        }
        return sum;
    }
}