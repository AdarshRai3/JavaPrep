 
public class Test9{
    
    public static void printInReverse(String s){
        String temp = "";
        String sb = "";
        for(char c:s.toCharArray()){
          if(c!=' '){
            temp = temp+c;
          }else if(temp!=null){
            sb=temp+" "+sb;
            temp="";
          }
        }
        sb=temp+" "+sb;
        System.out.println(sb);
    }
    public static void main(String[]args){
       String s = "Sky is Blue";
       printInReverse(s); 
    }
}