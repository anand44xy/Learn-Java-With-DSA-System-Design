class Demo1{
  public Demo1(){
    System.out.println("Parent class Constructor");
  }
}

class Demo2 extends Demo1{
   public Demo2(){
    this(29, 30);
    int n,m;
        System.out.println("Child class Costructor");
    }
    public Demo2(int x, int y){
        super();
        System.out.println("Parametrized class constructor");
        
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
        
        
    }
}
