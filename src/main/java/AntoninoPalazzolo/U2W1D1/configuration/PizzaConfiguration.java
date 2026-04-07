package AntoninoPalazzolo.U2W1D1.configuration;

import AntoninoPalazzolo.U2W1D1.entities.Pizza;
import AntoninoPalazzolo.U2W1D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PizzaConfiguration {

    @Bean
    public Topping cheese() {
        return new Topping("cheese", 92, 0.69);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Topping onions() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean
    public Topping pineApple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    public Topping salami() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean
    public Pizza margheritaPizza(Topping cheese) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(cheese);
        return new Pizza("Pizza Margherita", 1104, 4.99, toppings);
    }

    @Bean
    public Pizza hawaiiPizza(Topping cheese, Topping ham, Topping pineapple) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(cheese);
        toppings.add(ham);
        toppings.add(pineapple);
        return new Pizza("Pizza Hawaii", 1024, 6.49, toppings);
    }

    @Bean
    public Pizza salamiPizza(Topping cheese, Topping salami) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(cheese);
        toppings.add(salami);
        return new Pizza("Pizza Salami", 1160, 5.99, toppings);
    }


}
