import java.util.*;
public class Test15{
    
    public static boolean validateParanthesis(String test){
        Stack<Character> st = new Stack<>();
        for(char c : test.toCharArray()){
           if(c=='(' || c=='[' || c=='{'){
               st.push(c);
           }else{
               char top = st.pop();
               if((c==')' && top!='(')||(c==']' && top!='[') ||(c=='}' && top!='{')){
                    return false;
               }
           }
        }
         return st.isEmpty();

    }
    public static void main(String[] args){
         String s = "[{([]{}({[]}))}]";
         System.out.println(validateParanthesis(s));
         
    }
}