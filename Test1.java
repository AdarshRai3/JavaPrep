import java.util.*;
public class Test1 {
    
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        int[] hash = new int[26];
        Arrays.fill(hash,0);
        for(int i=0;i<s1.length();i++){
            hash[s1.charAt(i)-'a']++;
            hash[s2.charAt(i)-'a']--;
        }

        for(int i=0; i<26;i++){
            if(hash[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
         String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String s2 = "ZYXABCDEFGHIJKLMNOPQRSTUVW";
         
         boolean ans = isAnagram(s1,s2);
        
        System.out.println(ans);
    }
}
