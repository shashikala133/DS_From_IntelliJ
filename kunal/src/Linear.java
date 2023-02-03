public class Linear {
    public static void main(String[] args) {

        int[] arr = {13,54,22,75,21};
        String str="Shashi";
        //boolean ans=searchString(arr,22);
        //boolean ans=searchString(str,'k');
        int ans=min(arr);
        System.out.println(ans);
    }
    static boolean searchString(String str,char target){
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==target) return true;
//        }
        for(char ch:str.toCharArray())
            if (ch == target) return true;
        return false;
    }
    public static boolean search(int[] arr,int target){
        if(arr.length==0) return false;
        for (int j : arr) {
            if (j == target)
                return true;
        }
      return false;
    }
    static int max(int[] arr){
        int max=arr[0];
        for(int ele:arr){
            if(ele>max) max=ele;
        }
        return max;
    }

      //assume arr.length != 0 if so consider min=Integer.MAX_VALUE
    static int min(int[] arr){
        int min=arr[0];
        for(int ele:arr){
            if(ele<min) min=ele;
        }
        return min;
    }
}
