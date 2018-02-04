public class CoinsChangeJava {
    public int solution(int[] coins, int amount){
        int[] mins = new int[amount+1];
        mins[0]=0;
        for(int m=1; m<=amount;m++) {
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                if(m-coin>=0 && mins[m-coin]>=0) {
                    min = Math.min(min, mins[m-coin]);
                }
            }

            mins[m]= (min!=Integer.MAX_VALUE) ?
                    min+1 :
                    -1;
        }
        return mins[amount];
    }
}
