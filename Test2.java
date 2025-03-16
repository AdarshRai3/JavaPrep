import java.util.*;
public class Test2 {
    
    private static void countCharacter(String s){
        HashMap<Character,Integer> hs = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i),0)+1);
        }

        hs.forEach((key,value)->System.out.println(key+":"+value));

    }
    public static void main(String []args){
        String s ="AbcAAbzzyyyooeeRRRPPwnnnEonnanhndajnacaoa";
        countCharacter(s);
    }
}
