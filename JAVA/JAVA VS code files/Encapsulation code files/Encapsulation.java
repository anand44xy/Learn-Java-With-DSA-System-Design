class Student{
  private String name;
  private int age;
  private String city;

  public void setData(String name, int age, String city) {
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


public class Encapsulation {
public static void main(String[] args) {
  Student st=new Student();
  st.setData("Anand", 22, "Bnagaluru");
  String name=st.getName();
  int age=st.getAge();
  String city=st.getCity();

  System.out.println(name);
  System.out.println(age);
  System.out.println(city);

}
  
}