import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,5,1},
                {4,9,6},
                {0,3,8}
        };
        //boolean ans=search(arr,7);
       // boolean ans=search1(arr,8);
        int[] ans = search2(arr,5);
        System.out.println(Arrays.toString(ans));
    }
    public static boolean search1(int[][] arr,int target){
        for(int[] row:arr){
            for(int col:row){
                if(col==target) return true;
            }
        }
        return false;
    }
    public static int[] search2(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target) return new int[]{i, j};
            }
        }
        return new int[]{-1,-1};
    }
    private static boolean search(int[][] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target) return true;
            }
        }
        return false;
    }
}
