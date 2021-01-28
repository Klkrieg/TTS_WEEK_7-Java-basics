package day4;

public class Pet {

  private String name;
  private int age;
  private String location;
  private String type;


  public void speak(){
    if (this.type.equalsIgnoreCase("dog")) {
      System.out.println("Woof");
    } else if(this.type.equalsIgnoreCase("cat")) {
      System.out.println("Meow");
    } else{
      System.out.printf("What noise does a %s make anyway?\n", this.type);
    }
  }

  public Pet() {
  }

  public Pet(String name, int age, String location, String type) {
    this.name = name;
    this.age = age;
    this.location = location;
    this.type = type;
  }

  public int getAge() {
    return age;
  }

  public String getType() {
    return type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "Pet{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", location='" + location + '\'' +
            ", type='" + type + '\'' +
            '}';
  }
}
