package decorator;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public Long getCost() {
        return coffee.getCost();
    }

    public String getIngredients() {
        return coffee.getIngredients();
    }
}
