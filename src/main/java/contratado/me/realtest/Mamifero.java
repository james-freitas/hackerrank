package contratado.me.realtest;

public class Mamifero extends Animal{

    public void eat() {
        System.out.println("Mamiferos comem");
    }

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        m.eat();
    }
}
