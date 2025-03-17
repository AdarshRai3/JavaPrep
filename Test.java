
public class Test{

    private static int findSecondLargest(int[] arr){
       int max = Integer.MIN_VALUE;
       int smax = Integer.MIN_VALUE;
    
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
               smax=max;
               max=arr[i];
            }else if(max>arr[i] && smax<arr[i]){
               smax=arr[i];
            }
        }
          return smax;
    }

    private static int findIndexOfLargest(int[] arr){
        if(arr==null || arr.length<2){
            return -1;
        }
        int maxIndex = 0;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
             maxIndex=i;
             max = arr[i];
           }
        }
        return maxIndex;
    }
    public static void main(String [] args){
       
        int[] arr = new int[]{8,10,5,7,-9,10};

        int n = findSecondLargest(arr);
        System.out.println(n);
        int k = findIndexOfLargest(arr);
        arr[k]=-1;
        int l = findIndexOfLargest(arr);
        System.out.println(arr[l]);

        System.out.println(l);
        
    }
}