package nl.novi.javaprogrammeren.overerving;

public class Animal {
    private String name;
    private String sex;

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void move() {
        System.out.println("The animal is moving 0.25m.");
    }

    public void makeSound() {}

    public void sleep(){
        System.out.println("Zzzz. The animal is sleeping for 8 hours");
    }

    public void eat(String food){
        System.out.println("Yum yum yum. The animal is eating "+food+".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
