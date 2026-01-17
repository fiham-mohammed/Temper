package src;

public class fihm {
    private String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

    public void set(String std,int num){
        name=std;
        rollno=num;
    }
}