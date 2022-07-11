public class reverse {
    public static void main(String[] args) {
     //reverse1(1234);
     //System.out.println(sum);
        int ans = rev2(1234);
        System.out.println(ans);
        System.out.println(pal(1212));
    }

    static int sum = 0;

    static void reverse1(int n) {
        if (n == 0)
            return;
        int rem = n%10;
        sum = sum*10+rem;
        reverse1(n/10);

    }
    static int rev2(int n){
        int digit = (int)Math.log10(n)+1;
        return helper(n,digit);
    }

    private static int  helper(int n, int digit) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return (int) (rem*(Math.pow(10,digit-1))+helper(n/10,digit-1));
    }
    static boolean pal(int n){
        return (n==rev2(n));
    }
}
