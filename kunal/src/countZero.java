public class countZero {
    public static void main(String[] args) {
     System.out.println(count1(30204));
    }
    static int count1(int n){
      return helper(n,0);
    }

    private static int helper(int n, int count) {
        if(n==0){
            return count;
        }
        if(n%10==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
//in recursion if you are using more than one argumnet then use helper function
