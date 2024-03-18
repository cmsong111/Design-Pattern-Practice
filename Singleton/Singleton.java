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

    String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
