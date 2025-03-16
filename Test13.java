import java.util.*;
public class Test13 {
    private static int ifib(int n){
        if(n<2)return n;
        int prev =0;
        int curr =1;
        int next =1;
        for(int i = 2;i<=n;i++){
          next= curr+prev;
          prev=curr;
          curr=next;
        }
        return next;
    }
    private static int fib(int n, int[] dp){
        if(n<2) return n;
        if(dp[n]!=-1) return dp[n];

        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    } 
 
    private static void fibi(int[] dp){
        for(int num:dp){
            System.out.print(num+" ");
        }
    } 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int k = fib(n,dp);
        System.out.println(k);
        dp[0]=0;
        dp[1]=1;
        fibi(dp);
        int s = ifib(n);
        System.out.println(s);
        sc.close();
    }
}
