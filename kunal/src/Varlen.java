import java.util.Arrays;

public class Varlen {
    public static void main(String[] args) {
      fun(2,1,4,2,1,2,1,5);
      multiple(2,4,"hai","jsjjj");
    }
    static void multiple(int a,int b,String ...v){

    }
    static void fun(int ...v){
       System.out.println(Arrays.toString(v));
    }
}
//variable length argument must always be at the last in the list
//function overloading happens at compile time--> fun(int a)-->fun(String a)-->fun(int a,int b)
//function overriding happens at runtime