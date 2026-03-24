class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int num=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int dig= x%10;
            num = num*10+dig;
            x/=10;
        }
        return num==temp;
    }
}