class Solution {
    public int fib(int n) {
        int a=0;int b=1;
        int sum=0;
        if(n==1) return 1;
        for(int i=0;i<n-1;i++){
            sum=a+b;
            int temp=sum;
            a=b;
            b=temp;
        }
        return sum;
    }
}