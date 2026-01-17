package src.Animal;

public class Call {
    public static void main(String[] args) {
        Animal obj= new Animal();
        obj.eat();
        obj.walk();
        System.out.println(obj.noLegs);

        Dog obj1=new Dog();
        System.out.println(obj1.canBark);
        System.out.println(obj1.noLegs);
        obj1.eat();
        obj1.walk();
        Dog.canSleep=true;


        for(int i = 0; i<5; i++){
            System.out.println("Fiham");
        }
    }
}
