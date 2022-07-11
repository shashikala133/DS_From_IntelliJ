package com.shashi;

/*public class leaderArray {

    public void print(int[] arr,int size){
        int max=arr[size-1];
        System.out.println(max+"");
        for(int i=size-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.println(max+"");
            }
        }
    }
    public static void main(String[] args){
        leaderArray lead = new leaderArray();
        int arr[]={2,15,3,5,2};
        int n=arr.length;
        lead.print(arr,n);
    }
}*/

public class leaderArray {

    public void print(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] < arr[j])
                    break;
            }
            if (j == size)
                System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        leaderArray lead = new leaderArray();
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.print(arr, n);
    }
}
