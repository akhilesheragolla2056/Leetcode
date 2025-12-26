class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int firstNo=0;
        int secondNo=1;
        int nextNo=0;
        for(int i=2;i<=n;i++){
            nextNo=firstNo+secondNo;
            firstNo=secondNo;
            secondNo=nextNo;
        }
        return nextNo;
    }
}
