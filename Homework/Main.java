package Homework;

import Homework.Pensioner;
import Homework.Worker;

public class Main {
    public static void main(String[] args) {
//
//        Person person_1 = new Person("Vasya", 30, 180, 95, 159);
//        Person person_2 = new Person("Alexei", 15, 167, 58, 500);
//        Person person_3 = new Person("Petya", 28, 176, 104, 30000);
//        Person person_4 = new Person("Alexei", 71, 190, 120, 2674);

//        System.out.println(person_2.goToJob());
//        System.out.println(person_4.getMoney());

        Pensioner petrovich = new Pensioner("Petrovich", 86, 159, 55, 8, 3500);
        petrovich.die();

        Worker petrowna = new Worker("Petrovna", 48, 149, 80, 0, 1200, 1201);
        petrowna.die();

        petrowna.die(3);
        petrovich.die(2);


    }
}