package decorator;

public class ShotDecorator extends CoffeeDecorator {
    public ShotDecorator(Coffee coffee) {
        super(coffee);
    }

    public Long getCost() {
        return super.getCost() + 500;
    }

    public String getIngredients() {
        return super.getIngredients() + ", 샷 추가";
    }
}
