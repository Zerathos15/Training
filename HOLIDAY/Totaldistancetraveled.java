class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if(mainTank<5){
            return mainTank*10;
        }
        int tot = mainTank;
        while(mainTank!=0 && mainTank>=5 && additionalTank!=0){  
            tot+=1;
            mainTank-=5;
            mainTank++;
            additionalTank--;
        }
        return tot*10;
    }
}