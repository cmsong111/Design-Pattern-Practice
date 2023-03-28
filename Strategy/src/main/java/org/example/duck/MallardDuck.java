package org.example.duck;

import org.example.duck.fly.FlyWithWings;
import org.example.duck.quack.Squeak;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("\nI'm a real Mallard duck");
    }
}
