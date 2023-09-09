package Homework;

public class Pensioner extends Person {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pensioner pensioner = (Pensioner) o;

        return pension == pensioner.pension;
    }

    @Override
    public int hashCode() {
        return pension;
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pension=" + pension +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    private int pension;

    public int getPension() {
        return pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }


    public Pensioner(String name, int age, int height, int weight, int money, int pension) {
        super(name, age, height, weight, money);
        this.pension = pension;
    }

    @Override
    public void die() {
        System.out.println("Этот пенсинер умер, он заработал: " + (getAge() - 50) * pension + "$");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот пенсионер умрёт через " + years + " лет");
    }
}
