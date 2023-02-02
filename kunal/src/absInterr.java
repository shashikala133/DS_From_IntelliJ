
interface Writer{
//abstract class Writer{
    public abstract void write();
}
class Pen implements Writer{
//class Pen extends Writer{
    public void write(){
        System.out.println("Pen writer");
    }
}
class Pencil implements Writer{
    public void write(){
        System.out.println("Pencil writer");
    }
}
 class Kit {
    public void doSomething(Writer p){
        p.write();
    }
}

public class absInterr {
    public static void main(String[] args) {
        Kit k = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();
        k.doSomething(p);
        k.doSomething(pc);
    }
}
