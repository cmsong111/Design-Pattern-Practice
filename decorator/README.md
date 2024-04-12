# 데코레이터 패턴

## 1. 데코레이터 패턴이란?

- 데코레이터 패턴은 객체에 추가적인 요건을 동적으로 첨가한다.
- 데코레이터는 서브클래스를 만드는 것을 통해 기능을 유연하게 확장할 수 있는 방법을 제공한다.

## 2. 데코레이터 패턴의 구성

- 데코레이터 패턴은 다음과 같은 구성으로 이루어져 있다.
- Component: 인터페이스나 추상 클래스를 정의한다.
- ConcreteComponent: Component의 구현 클래스이다.
- Decorator: Component와 동일한 인터페이스를 가지며, ConcreteComponent 객체를 참조한다.