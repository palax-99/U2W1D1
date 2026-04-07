package AntoninoPalazzolo.U2W1D1.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;

    public Menu(List<Pizza> pizzaList, List<Drink> drinkList) {
        this.pizzaList = pizzaList;
        this.drinkList = drinkList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    @Override
    public String toString() {
        String result = "=== PIZZAS ===\n";
        for (Pizza p : pizzaList) {
            result += p.toString() + "\n";
        }
        result += "\n=== DRINKS ===\n";
        for (Drink d : drinkList) {
            result += d.toString() + "\n";
        }
        return result;
    }
}
