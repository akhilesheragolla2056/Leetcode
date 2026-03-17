class Solution {
    public int myAtoi(String s) {
        int num=0;
        int sign=1;
        String str=s.trim();
        if(str.length()==0) return 0;
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i<s.length()){
            if(s.charAt(i)=='-' || s.charAt(i)=='+') {
                if(s.charAt(i)=='-'){
                    sign=-1;
                    }
                 i++;
            }
        }

        for(;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))) break;
            int digit=s.charAt(i)-'0';
            if(num>(Integer.MAX_VALUE-digit)/10){
                return sign==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE; 
            }
            num=num*10+digit;

        }
        return num*sign;
}
}