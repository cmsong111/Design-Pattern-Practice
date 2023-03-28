package org.example;

import org.example.duck.MallardDuck;
import org.example.duck.RobotDuck;
import org.example.duck.RubberDuck;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        RobotDuck robotDuck = new RobotDuck();

        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        robotDuck.display();
        robotDuck.performQuack();
        robotDuck.performFly();
    }
}
