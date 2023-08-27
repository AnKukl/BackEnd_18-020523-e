package HW3;

public class Pensioner extends Person {
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
    public void die(){
        System.out.println("Этот пенсинер умер, он заработал: " + (Pensioner.getAge()-50)*pension );
    }

}
