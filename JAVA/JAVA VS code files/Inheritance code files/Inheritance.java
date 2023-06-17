class Human{ // parent/super/bser class
    int age;
    void sleep(){
       age=18;
        System.out.println("Human need goog sleep");
        System.out.println(age);
    }
}

class Student extends Human { // child/subclass/drived class

}
public class Inheritance {

    public static void main(String[] args) {
        Student obj=new Student();
        obj.sleep();
        
        
    }
}