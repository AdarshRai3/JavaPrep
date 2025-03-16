public class Test10 {

    private static void removeOuterParanthesis(String s){
        
          int flag = 0;
          StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
          if(!(c=='('&& flag==0) && !(c==')' && flag==1)){
              sb.append(c);
          }else if(c=='('){
              flag++;
          }else{
              flag--;
          }
        }
        System.out.println(sb.toString());
    }

    public static void removeParanthesis(String s){
         int flag = 0;
         StringBuilder sb = new StringBuilder();
         for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
              if(flag>0){
                 sb.append(s.charAt(i));
              }
             flag++;
            }
            else if(s.charAt(i)==')'){
                flag--;
                if(flag>0){
                    sb.append(s.charAt(i));
                }
            }else{
                sb.append(s.charAt(i));
            }
           }
           System.out.println(sb.toString());
    }

    public static void main(String[] args){
         String s1 ="((()))()";
         String s2 ="((ab)((anjkf)))";
         removeParanthesis(s2);
         removeOuterParanthesis(s1);
    }
}
