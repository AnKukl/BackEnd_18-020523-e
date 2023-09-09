package Homework;

import java.util.Objects;

public abstract class Person {

    String name;
    int age;
    int height;
    int weight;
    private int money; //Мы ограничили видимость поля в пределах 1 класса и чтобы можно было использовать значение поля за пределами класса нужно прописать геттер к этому классу

    public Person(String name, int age, int height, int weight, int money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;
    }

    public Person(int age, String name) {
    }
    public Person(){

    }

    public void getInfo() {
        System.out.println("Имя:" + name);
        System.out.println("Возраст:" + age);
        System.out.println("Рост:" + height);
        System.out.println("Вес:" + weight);
    }

    public String goToJob() {
        if (age < 18 || age > 70) {
            return "Отдыхаю дома";
        } else {
            return "Работаю";
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (height != person.height) return false;
        if (weight != person.weight) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + height;
        result = 31 * result + weight;
        result = 31 * result + money;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", money=" + money +
                '}';
    }

    public void die() {
        System.out.println("Человек погиб");
    }
    public abstract void die(int years);


}
