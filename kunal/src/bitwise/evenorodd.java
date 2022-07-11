package bitwise;

public class evenorodd {
    public static void main(String[] args) {
        int n=9;
        System.out.println(isodd(n));
    }

    private static boolean isodd(int n) {
        return (n&1)==1;
    }
}
