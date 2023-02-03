// leetcode --> 1295
public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr={12,10,345,22,63,78969};
        //int ans=countOfNumber(arr);
        //int ans=count2(arr);
        int ans=count(7);
        System.out.println(ans);
    }

    private static int countOfNumber(int[] arr) {
        int count=0;

        for(int i=0;i< arr.length;i++){
            int num=0;
            while(arr[i]>0){
                int rem=arr[i]%10;
                num+=1;
                arr[i]=arr[i]/10;
            }
            if(num%2==0) count++;
        }
        return count;
    }


    //  kunal's approach
    static int count2(int[] arr){
        int count=0;
        for(int ele:arr){

            if(even(ele)) count++;
        }
        return count;
    }

    private static boolean even(int ele) {
        if(ele<0) ele=ele * -1;

        int count=0;
        if(ele==0) count=1;
        while(ele>0){
           count++;
           ele=ele/10;
        }
        if(count%2==0) return true; // or return if(count%2==0)
        return false;
    }

    //easiest way to find the number of digits in an element
    private static int count(int ele){
        if(ele<0) ele=ele*-1;
        return (int)Math.log10(ele)+1;
        //if you want to get it in a binary format
       // return (int)Math.log(ele)+1;
    }
}
