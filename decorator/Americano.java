package decorator;

public class Americano implements Coffee {
    public Long getCost() {
        return 2000L;
    }

    public String getIngredients() {
        return "아메리카노";
    }
}
