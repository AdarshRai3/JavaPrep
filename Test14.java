import java.util.*;

public class Test14 {
    private static void intersection(int[]a,int[]b){
       List<Integer>ans= new ArrayList<>();
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int num : a){
         hm.put(num,hm.getOrDefault(num,0)+1);
       }
       for(int num : b){
         if(hm.containsKey(num) && hm.get(num)!=0){
            ans.add(num);
            hm.put(num, hm.get(num)-1);
         }
       }
       int[] result = ans.stream().mapToInt(x->x).toArray();
        System.out.println(Arrays.toString(result));
    }
    private static void union(int[]a,int[]b){
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : a) set.add(num);
        for(int num : b) set.add(num);
        ArrayList<Integer> ans = new ArrayList<>(set);
        int[] result =ans.stream().mapToInt(x->x).toArray();
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,4,5,8,7,4};
        int[] b = new int[]{1,2,6,9,9,3};
        intersection(a,b);
        union(a,b);
    }
}
