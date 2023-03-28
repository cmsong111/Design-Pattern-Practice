# Strategy 전략

## 전략 패턴이란?
> 전략 패턴은 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다. 전략 패턴은 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있도록 해준다.

## 전략 패턴의 구성요소
- 전략(Strategy) : 전략을 정의하는 인터페이스
- 구체적인 전략(ConcreteStrategy) : 전략을 구현하는 클래스

## 전략 패턴의 장점
- 전략 패턴을 사용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
- 전략 패턴을 사용하면 알고리즘을 쉽게 교체할 수 있다.
- 전략 패턴을 사용하면 알고리즘을 구성하는 데 필요한 데이터를 클라이언트에게 주입할 수 있다.

## 전략 패턴의 단점
- 전략 패턴을 사용하면 많은 전략 클래스가 필요하다.
- 전략 패턴을 사용하면 클라이언트가 전략을 선택해야 한다.
- 전략 패턴을 사용하면 전략 객체를 클라이언트에 주입해야 한다.

## 전략 패턴의 그림
![전략 패턴의 그림](https://user-images.githubusercontent.com/23499675/228321526-84061a1f-2f87-49a4-89f7-879184dc44e3.PNG)


### FlyWithWings 클래스
```java
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
```

### FlyBehavior 인터페이스
```java
public interface FlyBehavior {
    void fly();
}

```

### Duck 추상 클래스
```java
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
```

### MallardDuck 클래스
```java
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
```

### Main 클래스
```java
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
```

### 출력 결과
```
I'm a real Mallard duck
Squeak
I'm flying!!

I'm a rubber duckies
Quack
I can't fly

I'm a robot duck
<< Silence >>
I'm flying with a rocket
```
