import java.util.*;
public class Test6{
    
    private static void binaryToDecimal(String bin){
        int decimal = 0;
        int power=0;
        for(int i=bin.length()-1;i>=0;i--){
            if(bin.charAt(i)=='1'){
                decimal =  decimal + (int)Math.pow(2,power);
            } 
            power++;
        };
        System.out.println(decimal);
    }

    public static void decimalToBinary(int dec){
        StringBuilder sb = new StringBuilder();
        while(dec!=0){
            sb.append(dec%2);
            dec=dec/2;
        }
        System.out.println(sb.reverse().toString());
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
          String s = sc.next();
          binaryToDecimal(s);
          Integer i = sc.nextInt();
          decimalToBinary(i);
          
          sc.close();
    }
    
}
