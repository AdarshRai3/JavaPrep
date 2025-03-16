import java.util.*;

public class Test3 {
    
    private static void twoSum(int[] arr,int target){
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<arr.length;i++){
           int num = target-arr[i];
           if(hs.containsKey(num)){
              int[] ans = new int[]{i,hs.get(num)};
              System.out.println(ans[0]+" "+ans[1]);
           }
           hs.put(i,arr[i]);
        }
    }

    public static void main(String []args){
        int [] arr = new int[]{1,3,2,4,5};
        twoSum(arr,7);
    }
}
