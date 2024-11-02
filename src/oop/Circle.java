package oop;

import org.junit.jupiter.api.Test;

public class Circle {
    private int radie;

    public Circle(int r){
        radie = r;

    }

    public double calculateArea() {
        return radie*radie*3.14;
    }


    public boolean isBiggerThan(Circle circle) {
        System.out.println("Radien på frågande objekt "+radie);
        System.out.println("Radien på attribut objekt " + circle.radie);
        System.out.println("Arean frågande objekt "+ calculateArea());
        System.out.println("Arean attribut objekt " + circle.calculateArea());
        return (calculateArea()> circle.calculateArea());


    }
}
