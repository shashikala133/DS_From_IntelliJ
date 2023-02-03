// leetcode -- 1672

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr={
                {1, 5},
                {7, 3},
                {3, 5}
        };
     int ans=rich(arr);
     System.out.println(ans);
    }

    private static int rich(int[][] arr) {

        int max=0;
        for(int[] row:arr){
            int high=0;
            for(int col:row){
                high+=col;
            }
            if(high>max) max=high;
        }
        return max;
    }
}
