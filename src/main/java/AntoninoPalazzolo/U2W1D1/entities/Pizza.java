package AntoninoPalazzolo.U2W1D1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuItem {
    private List<Topping> toppings;

    public Pizza(String nome, int calorie, double prezzo, List<Topping> toppings) {
        super(nome, calorie, prezzo);
        this.toppings = toppings;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        List<String> nomi = new ArrayList<>();
        for (Topping t : toppings) {
            nomi.add(t.getNome());
        }
        String nomiUniti = String.join(", ", nomi);
        return getNome() + " (" + nomiUniti + ") - " + getCalorie() + " cal - " + getPrezzo() + "€";
    }
}
