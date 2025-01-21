class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int numBottlesTemp = numBottles;
        int numExchangeTemp = numExchange;
        int get =0;
        int rem =0;
        int ans =0;
        int empty =0;
        while(numExchangeTemp <= numBottlesTemp){
            get = numBottlesTemp / numExchangeTemp ;
            rem = numBottlesTemp % numExchangeTemp ;
            ans += get;
            empty = get+rem;
            numBottlesTemp = empty;
        }
        return numBottles+ans;





    
        
    }
}
