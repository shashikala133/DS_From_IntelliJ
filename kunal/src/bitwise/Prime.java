package bitwise;

public class Prime {
    public static void main(String[] args) {
       int n=20;
       for(int i=0;i<20;i++){
           System.out.println(i+" "+isPrime(i));
       }
    }
    static boolean isPrime(int n){
        int c=2;
        if(n<=1)
            return false;
        while(c<=Math.sqrt(n)){
            if(n%c==0)
                return false;
            c++;
        }
        return true;

    }
}
