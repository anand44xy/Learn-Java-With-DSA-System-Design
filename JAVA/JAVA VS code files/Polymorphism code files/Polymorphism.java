

class Animal{
    public void MakeSound(){
        System.out.println("Animal is making a sound");

    }
}
 class Dog extends Animal{
    public void MakeSound(){
        System.out.println("Dog is Barking");

    }
 }

 class Cat extends Animal{
    public void MakeSound(){
        System.out.println("Cat makes sound Miyaau");
    }
 }

public class Polymorphism {
    public static void main(String[] args) {
    Animal animal1=new Dog();
    Animal animal2=new Cat();

    animal1.MakeSound();
    animal2.MakeSound();
  
}    
}
