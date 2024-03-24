
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
