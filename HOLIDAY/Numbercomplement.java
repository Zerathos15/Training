class Solution {
    public int findComplement(int num) {
        if(num==0) return 1;
        int temp = num;
        int c=0;
        while(temp!=0){
            temp=temp>>1;
            c++;
        }
        int com = (1 << c) - 1;
        return num^com;
    } 
}