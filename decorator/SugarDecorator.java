package decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public Long getCost() {
        return super.getCost() + 500;
    }

    public String getIngredients() {
        return super.getIngredients() + ", 설탕 추가";
    }
}
