package ArraysRecursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
       int[]arr = {24,12,6,2,9};
       int[] arr2 ={12,43,1,2,2,8};
       //System.out.println(search(arr,9,0));
       //findrange(arr2,2,0);
      // System.out.println(list);
       // System.out.println(array(arr2,2,0,new ArrayList<>()));
        System.out.println(addall(arr2,2,0));
    }
    static int search(int[]arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target ){
            return index;
        }
        return  search(arr,target,index+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findrange(int[] arr,int target,int index){
        if(index == arr.length)
            return;
        if(arr[index]==target){
            list.add(index);
        }
        findrange(arr,target,index+1);
    }
    static ArrayList<Integer> array(int arr2[],int target,int index,ArrayList<Integer>list){
        if(index == arr2.length)
            return list;
        if(arr2[index]==target){
            list.add(index);
        }
        return array(arr2,target,index+1,list);
    }
    static ArrayList<Integer> addall(int[] arr2,int target,int index){
        ArrayList<Integer>list2 = new ArrayList<>();
        if(index==arr2.length)
            return list2;
        if(arr2[index]==target){
            list2.add(index);
        }
        ArrayList<Integer> below = addall(arr2,target,index+1);
        list2.addAll(below);
        return list2;
    }
}
