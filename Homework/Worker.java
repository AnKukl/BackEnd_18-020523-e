package Homework;

public class Worker extends Person implements AbleToCalculatePension {
    //    private static int minSalary = 900;
//    private static int maxSalary = 1100;
    private int minSalary;
    private int maxSalary;


    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Worker(String name, int age, int height, int weight, int money, int minSalary, int maxSalary) {
        super(name, age, height, weight, money);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Worker(int age, String name) {
        super(age, name);
    }

    public Worker() {
    }

    public Worker(int minSalary, int maxSalary) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        if (minSalary != worker.minSalary) return false;
        return maxSalary == worker.maxSalary;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + minSalary;
        result = 31 * result + maxSalary;
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void die() {
        System.out.println("Этот челлвек не дожил до пенсии.");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживёт до пенсии и умрёт через " + years + " лет");
    }


    @Override
    public double calculatePension() {
        switch (getGender()) {
            case Female:
                return CalculatorUtils.CalculateFemaleAverage(minSalary, maxSalary) * 0.25;
        }
        return CalculatorUtils.CalculateAverage(minSalary, maxSalary) * 0.25;
    }
}
