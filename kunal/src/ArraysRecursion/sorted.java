package ArraysRecursion;
//in java there is no pass by reference
public class sorted {
    public static void main(String[] args) {
        int[] arr ={2,5,8,19,15};
        System.out.println(Sorted(arr,0));
    }
    static boolean Sorted(int[] arr,int index){
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && Sorted(arr,index+1);
    }
}
