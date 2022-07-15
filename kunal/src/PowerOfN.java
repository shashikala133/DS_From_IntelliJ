//Naive approach
/*public class PowerOfN {
    public static void main(String[] args) {
        int n=5,k=3;
        int ans = 1;
        for(int i=0;i<k;i++){
            ans = ans*n;
        }
        System.out.println(ans);
    }
}
*/

//Binary Exponentiation

/*public class PowerOfN {
    public static void main(String[] args) {
        int n =5,k=3;
        int ans=1;
        while(k!=0){
            if(k%2==0){
                n=n*n;
                k=k/2;
            }
            ans=ans*n;
            k--;

        }
        System.out.println(ans);
    }
}*/

public class PowerOfN {
    public static void main(String[] args) {
        int n=5,k=3;
        double ans = Math.pow(n,k);
        System.out.println(ans);
    }
}