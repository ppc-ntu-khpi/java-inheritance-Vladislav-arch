package test;

import domain.Animal;
import domain.Raccoon;


public class TestAnimal {

    public static void main(String[] args) {
        Raccoon raccoon = new Raccoon("Thomas");
        System.out.println(raccoon);
        raccoon.hunting();

    }
}
