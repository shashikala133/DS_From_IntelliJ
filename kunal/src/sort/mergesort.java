package sort;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1)
            return arr;
        int mid=arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right,mid);
    }
    static int[] merge(int[] first,int[] second,int mid){
        int inversion=0;
        int[] mix = new int[first.length+second.length];
        int i=0,j=0,k=0;
      while(i< first.length && j< second.length){
          if(first[i]<second[j]){
              mix[k]=first[i];
              i++;
          }
          else{
              mix[k]=second[j];
              j++;
              inversion+=mid-i;
          }
          k++;
      }
        while(i< first.length){
            mix[k]=first[i];
            k++;
            i++;
        }
        while(j<second.length){
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;
    }
}
