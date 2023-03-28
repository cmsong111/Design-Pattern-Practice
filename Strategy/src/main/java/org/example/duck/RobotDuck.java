package org.example.duck;

import org.example.duck.fly.flyRockectPowerd;
import org.example.duck.quack.MuteQuack;

public class RobotDuck extends Duck{
    public RobotDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new flyRockectPowerd();
    }

    @Override
    public void display() {
        System.out.println("\nI'm a robot duck");
    }

}
