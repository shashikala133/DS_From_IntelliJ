import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumber {
    public static void main(String[] args) {
       int[] arr={4,3,2,7,8,2,3,1};
       List<Integer> res=missing(arr);

        System.out.println(res);
    }
    public static List<Integer>  missing(int[] arr){
        List<Integer> list=new ArrayList<>();
        int i=0;

        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j< arr.length;j++){
            //int correct=arr[j]-1;
            if(arr[j]!=j+1){
              list.add(j+1);
            }
        }
        return list;
    }
}
