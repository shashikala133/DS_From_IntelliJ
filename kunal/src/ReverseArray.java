import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,9};
        reverse(arr);
    }
    public static void reverse(int[] arr){
       int start=0;
       int n=arr.length-1;
       int end=n;
       while(start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
       System.out.println(Arrays.toString(arr));
    }
}
