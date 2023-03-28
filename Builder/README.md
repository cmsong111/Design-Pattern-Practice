# Builder 패턴

> 생성과 관련된 디자인 패턴으로, 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만드는 방법
## Builder 패턴의 클래스

``` java

public class Person {
    int age;
    String name;


    // Constructor
    public Person() {
        this.age = 0;
        this.name = "";
    }

    // Getter & Setter
    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    // Builder
    public static Person builder() {
        return new Person();
    }

    public Person build() {
        return this;
    }

    // toString
    @Override
    public String toString() {
        return "Person (" +
                "age=" + age +
                ", name='" + name + '\'' +
                ')';
    }
}
```

## Builder 패턴의 사용

``` java
public class Main {
    public static void main(String[] args) {

        Person person = Person.builder()
                .setAge(20)
                .setName("John")
                .build();

        System.out.println(person.toString());
    }
}
```

## 결과
```
Person (age=20, name='John')
```

