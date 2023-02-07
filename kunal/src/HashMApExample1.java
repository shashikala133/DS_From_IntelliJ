import java.util.Arrays;

public class HashMApExample1 {
    public static void main(String[] args) {
        int[] arr={3,1,2,1,2,3,2};
        int[] hash=new int[13];
        //System.out.println(Arrays.toString(hash));

        for(int i=0;i<arr.length;i++){

            hash[arr[i]]+=1;

        }
        System.out.println(Arrays.toString(hash));
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" "+hash[i]);
        }
    }
}
