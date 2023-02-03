package BinarySearch;

public class MainAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 22, 55, 65,86};
        int ans = binarySearch(arr,0);
        //int ans=ceil(arr,4);
        //int ans=floor(arr,23);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
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

    private static int ceil(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
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
        return arr[start];
    }

    private static int floor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
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
        return arr[end];
    }
}
