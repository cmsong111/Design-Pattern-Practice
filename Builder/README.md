# Builder 패턴

> 생성과 관련된 디자인 패턴으로, 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만드는 방법

Builder 패턴 사용시 장점

- 생성자에 매개변수가 많을 때, 매개변수의 순서를 기억할 필요가 없다.
- 매개변수의 일부만 설정하고 나머지는 기본값을 사용할 수 있다.

## Builder 패턴의 클래스

```java
public class Person {
    int age;
    String name;

    // Getter & Setter & toString() 생략

    // Builder pattern
    public static class Builder {
        private int age;
        private String name;

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Person build() {
            return new Person(age, name);
        }
    }
}

```

## Builder 패턴의 사용

```java
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder()
                .age(25)
                .name("John")
                .build();

        System.out.println(person1);

        Person person2 = new Person.Builder()
                .name("Jane")
                .age(30)
                .build();

        System.out.println(person2);
    }
}

```

## 결과

```
Name: John, Age: 25
Name: Jane, Age: 30
```
