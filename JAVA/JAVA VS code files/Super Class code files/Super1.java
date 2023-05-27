public class Super1 {
    public static void main(String[] args) {

        Tiger t1 = new Tiger("Anand");
        t1.eat();


    }
}

class Animal {
    Animal() {
        System.out.println("this is animal constructor");
    }
    String name = "Anand";
}

class Tiger extends Animal {

    Tiger() {
        System.out.println("This is constructor of tiger");
    }
    Tiger(String name){
        this();
        System.out.println("tiger name is anand (tiger name parameter constructor)");
    }

    void eat() {
        System.out.println("Tiger is eating");
    }

}
