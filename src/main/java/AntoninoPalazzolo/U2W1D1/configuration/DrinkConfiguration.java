package AntoninoPalazzolo.U2W1D1.configuration;

import AntoninoPalazzolo.U2W1D1.entities.Drink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfiguration {

    @Bean
    public Drink lemonadeDrink() {
        return new Drink("Lemonade", 128, 1.29, 0.33);
    }

    @Bean
    public Drink waterDrink() {
        return new Drink("Water", 0, 1.29, 0.5);
    }

    @Bean
    public Drink wineDrink() {
        return new Drink("Wine", 607, 7.49, 0.75, 13);
    }

}
