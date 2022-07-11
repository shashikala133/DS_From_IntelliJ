public class sumOfDigits {
    /*public static void main(String[] args) {
       int ans1 = sum(1342);
       System.out.println(ans1);
    }
    static int sum(int n){
        if(n%10==n)
            return n;
        //int rem = n%10;
        //return n%10+sum(n/10);
        return (n%10)*sum(n/10);
    }*/
    public static void main(String[] args) {
        concept(5);
    }
    static void concept(int n){
        if(n==0)
            return;
        System.out.println(n);
        concept(--n); //n-- will be stackoverflowerror
    }
}
