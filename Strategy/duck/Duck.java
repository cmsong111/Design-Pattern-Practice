package org.example.duck;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.duck.fly.FlyBehavior;
import org.example.duck.quack.QuackBehavior;

@NoArgsConstructor
@Data
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
