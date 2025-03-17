import java.util.*;

public class PrepSpace {
    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] hash = new int[26];
        Arrays.fill(hash, 0);
        for (int i = 0; i < s1.length(); i++) {
            hash[s1.charAt(i) - 'a']++;
            hash[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (hash[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAnagramMap(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1);
            hm.put(s2.charAt(i), hm.getOrDefault(s2.charAt(i), 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;

    }

    public static char maxFrequency(String s) {
        HashMap<Character, Integer> fm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            fm.put(s.charAt(i), fm.getOrDefault(s.charAt(i), 0) + 1);
        }
        int maxOcc = 0;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : fm.entrySet()) {
            if (entry.getValue() > maxOcc) {
                maxOcc = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(maxChar + ":" + maxOcc);
        return maxChar;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                int[] val = new int[] { nums[i], x };
                System.out.println(Arrays.toString(val));
                return new int[] { i, map.get(x) };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static boolean twoSumExist(int[] arr, int target) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int sum = arr[low] + arr[high];
            if (sum == target) {
                return true;
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }

    public static int binarySearch(int[] arr, int target) {

        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length < 2) {
            if (arr[0] == target)
                return 0;
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public static int binarySearchR(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + ((high - low) >> 1);

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchR(arr, target, low, mid - 1);
        } else {
            return binarySearchR(arr, target, mid + 1, high);
        }
    }

    public void fib(int n) {
        if (n < 1)
            System.out.println(n);
        int prev = 0;
        int curr = 1;
        int i = 0;
        while (i < n) {
            int next = curr + prev;
            prev = curr;
            curr = next;
            System.out.println(curr + " ");
            i++;
        }
        System.out.println("\n nth fib: " + curr);
    }

    public static int fibR(int n) {
        if (n < 2)
            return n;

        return fibR(n - 1) + fibR(n - 2);
    }

    public static int factR(int n) {
        if (n < 2)
            return 1;

        return n * factR(n - 1);
    }

    public static int fact(int n) {
        if (n < 2)
            return 1;
        int res = n;
        int b = n - 1;

        while (b > 0) {
            res = res * b;
            b--;
        }
        return res;
    }

    public static int[] intersection(int[] a, int[] b) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            if (set.contains(num)) {
                ans.add(num);
            }
        }
        return ans.stream().mapToInt(x -> x).toArray();
    }

    public static int[] union(int[] a, int[] b) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }
        List<Integer> ans = new ArrayList<>(set);
        return ans.stream().mapToInt(x -> x).toArray();
    }

    public static void swap(int[] arr, int low, int high) {
        if (low != high && arr[low] != arr[high]) {
            arr[high] = arr[low] ^ arr[high];
            arr[low] = arr[low] ^ arr[high];
            arr[high] = arr[low] ^ arr[high];
        }
    }

    public static void reverseArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            swap(arr, low, high);
            low++;
            high--;
        }
        return;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static String changeString(String s) {
        String ans = "Raju";
        return ans;
    }

    public static int[] changeArray(int[] arr) {
        arr[0] = -1;
        return arr;
    }

    public static void main(String[] args) {
        // p1
        // String s1 = "Abcdefghrjklmnopqrstuvwxyz";
        // String s2 = "mnopqrrstuvwxyzAbcdefghijkl";
        // boolean ans = checkAnagram(s1, s2);
        // System.out.println(ans);
        // boolean res = checkAnagramMap(s1, s2);
        // if (res) {
        // System.out.println("Both s1 and s2 are Anagram");
        // }else{
        // System.out.println("S1 and S2 are not an anagram");
        // }
        // ---------------------------------------------------------
        // p2
        // String s = "afafknaoidjanlkajcawlanvkjnvjwojdkacjaopalfmakfbwoajajkaj";
        // System.out.println(maxFrequency(s));
        // ------------------------------------------------------------
        // p3
        // int[] arr = new int[]{1,3,4,8,0,9,3};
        // int target=12;
        // int[] ans = twoSum(arr,target);
        // System.out.println(Arrays.toString(ans));
        // ----------------------------------------------------------------
        // p4
        // int[] arr = new int[]{0,1,3,4,5,2,5,6};
        // int target=10;
        // boolean exist = twoSumExist(arr,target);
        // if(exist){
        // System.out.println("Yes,twoSum exist");
        // }else{
        // System.out.println("No,twoSum doesn't exist");
        // }
        // ---------------------------------------------------------------------
        // p5
        // int[] arr = new int[]{0,1,2,3,4,5,9,17,16,24,25};

        // int target= 9;
        // // int index = binarySearch(arr,target);
        // int index = binarySearchR(arr,target,0,arr.length-1);
        // if(index==-1){
        // System.out.println("Target Element doesn't exist");
        // }else{
        // System.out.println("Target found at index:"+index);
        // }
        // ------------------------------------------------------------------------
        // p6
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // PrepSpace p1 = new PrepSpace();
        // p1.fib(n);
        // int nthFib = fibR(n);
        // System.out.println("Nth Fib :"+nthFib);
        // sc.close();
        // ---------------------------------------------------------------------------
        // p7
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int ans=factR(n);
        // int res=fact(n);
        // System.out.println(ans);
        // System.out.println(res);
        // sc.close();
        // ------------------------------------------------------------------------------
        // p8
        // int[] a = new int[]{1,4,7,9,0,5,8};
        // int[] b = new int[]{2,3,2,1,5,0,8,9};
        // int[] intsect = intersection(a,b);
        // int[] union = union(a,b);
        // System.out.println(Arrays.toString(intsect));
        // System.out.println(Arrays.toString(union));
        // ------------------------------------------------------------------------------
        // p9
        // int[] arr = new int[]{1,2,3,5,7,9};

        // if(isSorted(arr)){
        // System.out.println("Yes, the array is sorted");
        // }else{
        // System.out.println("No, the array is not sorted");
        // }
        // reverseArray(arr);
        // System.out.println(Arrays.toString(arr));
        // -------------------------------------------------------------------------------------
        // p10
        // String s = "Ram";
        // int[] ans = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(Arrays.toString(ans));
        // System.out.println(s);
        // changeString(s);
        // changeArray(ans);
        // System.out.println(s);
        // System.out.println(Arrays.toString(ans));
        // ------------------------------------------------------------------------------
        //P11
         

    }
}