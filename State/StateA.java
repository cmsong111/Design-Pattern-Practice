class StateA implements State {
    public void doAction(Context context) {
        System.out.println("State A is set.");
        context.setState(new StateB());
    }
}
