
import com.example.Dog;

class HelloChina {
  public void println(String text) {
    System.out.println(text);
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.run();
    System.out.println(dog.getName());
  }
}
