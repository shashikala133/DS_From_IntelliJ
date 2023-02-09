import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cycle(int[] arr){
        int i=0;
        while(i<arr.length-1){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
              swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
