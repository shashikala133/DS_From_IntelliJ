//import java.util.*;
//
//public class HashMAp {
//
//   public static void main(String args[]){
//
//       int arr[] = {10,5,10,15,10,5};
//       int n = arr.length;
//       Frequency(arr, n);
//   }
//   static void Frequency(int arr[], int n)
//   {
//       Map<Integer, Integer> map = new HashMap<>();
//
//       for (int i = 0; i < n; i++)
//       {
//           if (map.containsKey(arr[i]))
//           {
//               map.put(arr[i], map.get(arr[i]) + 1);
//           }
//           else
//           {
//               map.put(arr[i], 1);
//           }
//       }
//       // Traverse through map and print frequencies
//       for (Map.Entry<Integer,Integer> entry : map.entrySet())
//       {
//           if(entry.getValue()>=Math.floor(n/2))
//           System.out.println(entry.getKey());
//       }
//   }
//}

//HashMap Method
import java.util.HashMap;
import java.util.Map;

public class HashMAp {
   public static void main(String[] args) {
       int[] arr = {10,5,10,15,10,5};
       int n = arr.length;
       count(arr,n);
   }

   private static void count(int[] arr, int n) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<n;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);
           }
           else{
               map.put(arr[i],1);
           }
       }
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
           if(entry.getValue()>=Math.floor(n/2)){
               System.out.println(entry.getKey());
           }
       }
   }
}

//majority voting method
//public class HashMAp {
//    public static void main(String[] args) {
//        int[] arr = {10,5,10,15,10,5};
//        int n = arr.length;
//        System.out.println(count(arr,n));
//    }
//
//    private static int count(int[] arr, int n) {
//        int a = 0;
//        int b = 0;
//        for(int num:arr){
//           if(a==0){
//               b = num;
//           }
//           if(num == b)
//               a+=1;
//           else a-=1;
//        }
//        return b;
//    }
//}