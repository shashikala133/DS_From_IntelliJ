public class noOfDigits {
    public static void main(String[] args) {
        int arr[] = {10,5,3,3,2,3,3,3};
        int n=arr.length;
        count(arr,n);
    }

    private static void count(int[] arr, int n) {
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++) {
            if (visited[i] == true)
                continue;
            int count=1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    visited[j] = true;
                    count++;
                }
            }
            if(count>Math.floor(n/2)){
                System.out.println(arr[i]);
            }
        }


    }
}
