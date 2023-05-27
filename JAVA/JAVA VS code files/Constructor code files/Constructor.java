class Student{

private String name;
private int age;
private String city;

Student(String name,int age, String city){
    this.name=name;
    this.age=age;
    this.city=city;
}
public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public String getCity(){
    return city;
}

}

public class Constructor {
    public static void main(String[] args) {
        Student std=new Student("Anand", 22, "Bansur");
        
        System.out.println(std.getName());
        System.out.println(std.getAge());
        System.out.println(std.getCity());
    
        
    }
}
