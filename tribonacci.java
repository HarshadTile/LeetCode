class Solution {
    public int tribonacci(int n) {
        if(n==1){
            return 1;
        }
        int size = n;
        int a = 0;
        int ans =0 ;
        int b = 0;
        int c = 1;
        int i = 0;
        while(i<size-1){
            ans = a + b + c;
            a = b;
            b = c;
            c = ans;
            i++;
            
        }
        return ans;
    }
}
