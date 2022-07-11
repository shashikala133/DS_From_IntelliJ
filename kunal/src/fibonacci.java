/*public class fibonacci {
    public static void main(String[] args) {
      int ans = fibo(4);
      System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2)
            return n;
        return fibo(n-1)+fibo(n-2);//this is not tail function
    }
}
//when you have a last function in the recursion it is called tail recursion  like in the case of printing first 5 natural numbers
//print(n+1)*/

/*public class fibonacci{
    public static void main(String[] args) {
        int[] arr={1,4,6,88,99};
      int ans = binary(arr,1,0,arr.length-1);
      System.out.println(ans);
    }
    static int binary(int[] arr,int target,int s,int e){
        if(s>e) {
            return -1;
        }
        int m=(s+e)/2;
        if(target==arr[m]){
            return m;
        }
        if(arr[m]>target){
            return binary(arr,target,s,m-1);
        }
        return binary(arr,target,m+1,e);
    }
}*/

/*public class fibonacci {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n==0)
            return;
        System.out.println(n);
        print(n-1);
    }
}*/

public class fibonacci {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n==0)
            return;

        print(n-1);
        System.out.println(n);
    }
}
