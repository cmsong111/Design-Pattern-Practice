# 옵저버 패턴

## 1. 옵저버 패턴이란?

- 객체의 상태 변화를 관찰하는 관찰자(Observer) 목록을 객체에 등록하여 상태 변화가 있을 때마다 메서드 등을 통해 객체들에 통보하도록 하는 패턴이다.

- 객체의 상태 변화를 관찰하는 관찰자 목록을 객체에 등록하여 상태 변화가 있을 때마다 메서드 등을 통해 객체들에 통보하도록 하는 패턴이다.

## 2. 옵저버 패턴의 구조

- Subject: 관찰 대상이 되는 객체
- Observer: 관찰자 객체

## 3. 옵저버 패턴의 장단점

- 장점
  - 객체 간의 느슨한 결합을 가능하게 한다.
  - 객체의 상태 변화를 통보받는 관찰자 객체들을 쉽게 추가하거나 제거할 수 있다.

- 단점
    - 관찰자가 많아질수록 성능 저하가 발생할 수 있다.

## 4. 인터페이스

### Observer 인터페이스

```java
public interface Observer {
    void update() // 옵저버에게 상태 업데이트 알림
}
```

### Subject 인터페이스
```java
interface Subject {
	registerObserver() // 옵저버 등록
	removeObserver() // 옵저버 삭제
	notifyObserver() // 옵저버에게 업데이트 알림
}
```

## 5. 예제

```java
public class Main {
    public static void main(String[] args) {
        Subject subject = new SubjectImple();
        Observer observer1 = new ObserverImpl("Observer1", subject);
        Observer observer2 = new ObserverImpl("Observer2", subject);
        Observer observer3 = new ObserverImpl("Observer3", subject);

        subject.setState("State 1");
        subject.setState("State 2");
        subject.setState("State 3");
    }
}

```

```java
public class SubjectImple implements Subject {
    private List<Observer> observers;
    private String state;

    public SubjectImple() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObserver();
    }
}

```

```java
public class ObserverImpl implements Observer {
    private String observerName;
    private String observerState;
    private Subject subject;

    public ObserverImpl(String observerName, Subject subject) {
        this.observerName = observerName;
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String state) {
        this.observerState = state;
        System.out.println("Observer " + observerName + " updated with state: " + observerState);
    }
}

```
### 실행 결과
```plain
Observer Observer1 updated with state: State 1
Observer Observer2 updated with state: State 1
Observer Observer3 updated with state: State 1
Observer Observer1 updated with state: State 2
Observer Observer2 updated with state: State 2
Observer Observer3 updated with state: State 2
Observer Observer1 updated with state: State 3
Observer Observer2 updated with state: State 3
Observer Observer3 updated with state: State 3
```

## 6. 참고

Obserable 클래스는 이제 JDK 9부터 Deprecated 되었다. 
따라서 Obserable 대신 리액티브 스트림을 사용하는 것을 권장한다.

