package src.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Daughter D=new Daughter();
        System.out.println(D.gender);
        D.print();

        son s=new son();
        System.out.println(s.gender);
        s.print();
    }
}
