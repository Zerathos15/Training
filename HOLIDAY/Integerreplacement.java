class Solution {
    public int integerReplacement(int num) {
        long n = num;
        int c=0;
        if(n<4){
                return num-1;
        }
        while(n>1){
            if(n%2==0){
                n/=2;
                c+=1;
            }
            else if(n==3){
                return c+2;
            }
            else{
                if(n%4==1){
                    n-=1;
                    c+=1;
                }
                if(n%4==3){
                    n+=1;
                    c+=1;
                }
            }
        }
        return c;
    }
}