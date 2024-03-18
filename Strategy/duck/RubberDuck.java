package org.example.duck;

import org.example.duck.fly.FlyNoWay;
import org.example.duck.quack.Quack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("\nI'm a rubber duckies");
    }
}
