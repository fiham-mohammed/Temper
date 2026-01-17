package src.Inheritance.Multiple_Inheritance;

class Son implements Mother,Father{
    @Override
    public void call() {
        System.out.println("Son calling");
    }
    @Override
    public void eat(){
        System.out.println("Son eating");
    }
    @Override
    public void sleep(){
        System.out.println("Son sleeping");
    }

    public static void main(String[] args) {
        Son s=new Son();
        s.call();
        s.eat();
        s.sleep();
    }
}
