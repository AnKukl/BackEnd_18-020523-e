package HW3;

public class Worker extends Person {
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
    @Override
    public void die(){
        System.out.println("Этот челлвек не дожил до пенсии.");
    }
}
