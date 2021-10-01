package Training;

public class Dog {

    String name;
    int age;
    double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sparky", 2, 25);
        System.out.println(d1.toString());
        System.out.println(d1);
    }
}
