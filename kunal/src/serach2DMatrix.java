public class serach2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}};
        int target = 24;
        int n = arr.length;
        int m = arr[0].length;
        boolean ans=search2d(arr,n,m,target);
        System.out.println(ans);
    }

    private static boolean search2d(int[][] arr,int n,int m,int target) {
        int lo=0;
        int hi = (n*m)-1;
        if(arr.length == 0)return false;
        while(lo<=hi){
            int mid = (lo+(hi-lo)/2);
            if(arr[mid/m][mid%m]==target) return true;
            if(arr[mid/m][mid%m]<target){
                lo = mid+1;
            }
            else
                hi = mid-1;
        }
        return false;
    }
}

