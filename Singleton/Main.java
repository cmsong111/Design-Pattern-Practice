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
