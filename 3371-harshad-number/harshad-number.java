class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int o=n;
        int sum=0;
        while(n>0){
            int l=n%10;
            sum+=l;
            n/=10;
        }
        if(sum!=0 && o%sum==0){
            return sum;
        }else{
            return -1;
        }

        
    }
}