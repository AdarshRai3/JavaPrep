import java.util.*;

public class Test11{
    
    private void maxOccurenceChar(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
         int maxOcc = 0;
         char maxChar=' ';
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            if(entry.getValue()>maxOcc){
                maxOcc = entry.getValue();
                maxChar= entry.getKey();
            }
        }
        System.out.println(maxChar+":"+maxOcc);
    }
    
    private static void maxCharOcc(String s){
       s=s.toLowerCase();
       int hash[] = new int[26];
       Arrays.fill(hash,0);
       for(int i = 0 ;i<s.length();i++){
          if(Character.isLetter(s.charAt(i))){
            hash[s.charAt(i)-'a']++;
          }
       }
        int max = 0;
        int maxIndex = -1;
       for(int i = 0;i<26;i++){
         if(hash[i]>max){
            max=hash[i];
            maxIndex=i;
         }
       }
       char maxChar = (char)(maxIndex + (int)'a');
       System.out.println(max +":"+ maxChar);
    }
    public static void main(String[] args){
        String s = "askncojojkmaopjfmdljksffffffffafoiwjpfovisnkqwjfksfihfafahifhaifkjanufewaaaaaajja9ojoJOIIHNUHIDJoajaoijo";
        Test11 t = new Test11();
        t.maxOccurenceChar(s);
        maxCharOcc(s);
    }
}