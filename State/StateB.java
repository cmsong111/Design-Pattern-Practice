class StateB implements State {
    public void doAction(Context context) {
        System.out.println("State B is set.");
        context.setState(new StateB());
    }
}
