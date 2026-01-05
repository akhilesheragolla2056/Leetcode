class Solution {
     public static String capitalizeTitle(String str){
        String[] words = str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
          String word=words[i];
          if(word.length()<=2){
            sb.append(word.toLowerCase());
          }else{
            char firstChar=Character.toUpperCase(word.charAt(0));
            String remaining=word.substring(1).toLowerCase();
            sb.append(firstChar).append(remaining);
          }
          if(i<words.length-1){
            sb.append(" ");
          }
        }
          return sb.toString(); 
    }
}