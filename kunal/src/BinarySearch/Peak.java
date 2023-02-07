package BinarySearch;

public class Peak {
    public static void main(String[] args) {
        int[] arr={2,5,8,5,3,1};
        int ans=peak(arr);
        System.out.println(ans);
    }

    private static int peak(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
              end=mid;
            }
        }
        return start;
    }
}
