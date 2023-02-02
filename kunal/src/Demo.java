
@FunctionalInterface
interface A{
    void show();
}
//class B extends Object implements A{
//    public void show(){
//        System.out.println("hii");
//    }
//
//}
public class Demo {
    public static void main(String[] args) {
       //A obj = new B();
        A obj = ()-> System.out.println("hiiii");
        obj.show();
    }
}
