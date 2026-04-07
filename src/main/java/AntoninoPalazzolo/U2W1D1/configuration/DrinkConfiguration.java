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
    

}
