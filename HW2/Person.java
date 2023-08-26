package Homework.HW2;

public class Person {
    public static void main(String[] args) {
        Person person_1 = new Person("Vasya", 30, 180, 95, 159);
        Person person_2 = new Person("Alexei", 15, 167, 58, 500);
        Person person_3 = new Person("Petya", 28, 176, 104, 30000);
        Person person_4 = new Person("Alexei", 71, 190, 120, 2674);

        System.out.println(person_2.goToJob());
        System.out.println(person_4.getMoney());
    }


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
}
