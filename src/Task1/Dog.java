package Task1;

public class Dog {
    private String name;
    private int age;

    public Dog (){
        name = "Noname dog";
        age = 0;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog(int age) {
        this.age = age;
        this.name = "Noname dog";
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age;
    }

    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+"years");
    }
}
