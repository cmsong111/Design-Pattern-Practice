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
