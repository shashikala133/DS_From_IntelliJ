package bitwise;

public class Sieve {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
    }
//in this case if array element is false then it is prime
    //initially all elements in boolean array will be false
    private static void sieve(int n, boolean[] primes) {
        for(int i=2;i*i<n;i++){
            if(!primes[i]){
                for(int j=i*2;j<n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(!primes[i]){
                System.out.println(i+"");
            }
        }
    }
}
//space coplexity=O(n)
//time complexity=O(n*log(logn))
