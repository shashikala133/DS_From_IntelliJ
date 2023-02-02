public class Navin {
    public static void main(String[] args) {
        Alien a = new Alien();
        Alien b = new Alien();
        b.name = "";
        System.out.println(a.name);
        System.out.println(a.salary);
    }
}

class Alien{
    String name="Shashikala";
    int age = 21;
    String role = "developer";
    int salary = 5000;
}
