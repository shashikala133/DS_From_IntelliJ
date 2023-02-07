package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,34,55,77,98,101};
        int target=10;
        int ans=ans1(arr,target);
        System.out.println(ans);
    }

    private static int ans1(int[] arr, int target) {
       int start=0;
       int end=1;
       while(target>arr[end]){
           int newStart = end+1;
           end = end + (end-start+1) *2;
           start=newStart;
       }
       return binary(arr,target,start,end);
    }

    private static int binary(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
