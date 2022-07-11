package bitwise;

public class findsingle {
    public static void main(String[] args) {
        int[] arr={2,4,2,3,5,4,5};
        System.out.println(single(arr));
    }

    private static int single(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }

        return ans;
    }
}
