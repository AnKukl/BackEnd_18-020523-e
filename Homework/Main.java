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
        petrovich.setGender(Gender.Male);
        petrovich.die();

        Worker petrowna = new Worker("Petrovna", 48, 149, 80, 0, 900, 1100);
        Worker vasilich = new Worker("Vasilich", 36, 187, 50, 0, 900, 1100);
        petrowna.setGender(Gender.Female);
        vasilich.setGender(Gender.Male);
        petrowna.die();

        PensionFund DzakuziGuys = new PensionFund( "DzakuziGuys", true, "17.09.0001", 55000);
        PensionFund DzakuziGuysNewGeneration = new PensionFund( "DzakuziGuysNewGeneration", false, "17.09.1001", 3);

        System.out.println(DzakuziGuys.calculatePensionFor(vasilich));
        System.out.println(DzakuziGuys.calculatePensionFor(petrowna));
        System.out.println(DzakuziGuysNewGeneration.calculatePensionFor(petrowna));


        petrowna.die(3);
        petrovich.die(2);
        System.out.println(petrowna.calculatePension());
        System.out.println(vasilich.calculatePension());


    }
}