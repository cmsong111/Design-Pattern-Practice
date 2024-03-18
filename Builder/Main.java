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
