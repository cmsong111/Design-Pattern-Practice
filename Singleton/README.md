# Singleton Pattern

> 유일한 객체를 생성하는 패턴

## 장점

- 유일한 객체를 생성하고, 이에 접근할 수 있는 전역적인 접근점을 제공한다.
- 인스턴스가 오직 하나임을 보장한다.
- 전역 변수를 사용하지 않고, 객체를 생성할 수 있다.

## 단점

- 싱글톤 패턴을 사용하면, 객체간의 결합도가 높아진다.
- 멀티스레드 환경에서 동기화 처리를 해주어야 한다.

## 사용법

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // 싱글턴으로 사용할 변수
    // Geter and Setter 생략
    String state;
}
```

## 예제
```java
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setState("First state set by singleton instance");
        System.out.println("singleton stats:\t" + singleton.getState());
        System.out.println("singleton hashCode:\t"+   singleton.hashCode());


        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println("anotherSingleton stats:\t" + anotherSingleton.getState());
        System.out.println("anotherSingleton hashCode:\t"+   anotherSingleton.hashCode());

    }
}
```

## 결과
```plaintext
singleton stats:	First state set by singleton instance
singleton hashCode:	1554547125
anotherSingleton stats:	First state set by singleton instance
anotherSingleton hashCode:	1554547125
```

state가 같고, hashCode가 같은 것을 확인할 수 있다.