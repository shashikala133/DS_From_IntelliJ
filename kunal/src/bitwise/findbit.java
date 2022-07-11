package bitwise;
//find the i'th bit
public class findbit {
    public static void main(String[] args) {
        int n=10010001;
        int target=3;
        System.out.println(find(n,target));
    }

    private static int find(int n,int target) {
        return target&(1<<target-1);
    }
}
