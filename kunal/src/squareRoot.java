public class squareRoot {
    public static void main(String[] args) {
      int n=2147395599;
      int ans=sqrt(n);
        System.out.println(ans);
    }
    static int sqrt(int n){
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            long mul=(long)mid*mid;
            if(mul<n){
                start=mid+1;
            }else if(mul>n){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
