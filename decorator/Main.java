package decorator;

public class Main {
    public static void main(String[] args) {
        // 일반 아메리카노
        Coffee coffee = new Americano();
        System.out.println(coffee.getCost());
        System.out.println(coffee.getIngredients());

        // 아메리카노에 샷 추가
        coffee = new ShotDecorator(coffee);
        System.out.println(coffee.getCost());
        System.out.println(coffee.getIngredients());

        // 아메리카노에 샷 추가 후 설탕 추가
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getCost());
        System.out.println(coffee.getIngredients());
    }
}
