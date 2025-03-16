public class Test5 {
    
    private static void binarySearch(int[]arr,int target){
        int low = 0;
        int high= arr.length-1;

        while(low<=high){
            int mid = low+((high-low)>>1);
            if(arr[mid]== target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target){
                 low=mid+1;
            }
            else{
                 high=mid-1;
            }
        }
        System.out.println("Target element is not present in the array");
    }

    private static void binarySearchR(int[]arr,int target,int low, int high){
        if(arr==null || low>high)return;
        if(arr.length<2){
            if(target!=arr[0])return;
            System.out.println(arr[0]);
            return;
        }
            int mid = low + ((high-low)>>1);
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target){
                binarySearchR(arr, target,mid+1, high);
            }else{
                binarySearchR(arr, target,low,mid-1);
            }
        
        

    }
    public static void main(String []args){
        int [] arr = new int[]{1,2,3,4,7,8,9,13,14,20,21,27};
        binarySearch(arr,20);
        binarySearchR(arr,20,0,arr.length-1);
    }
}
