package AntoninoPalazzolo.U2W1D1.runner;

import AntoninoPalazzolo.U2W1D1.entities.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

public class Run {
    @Component
    public class PizzeriaRunner implements CommandLineRunner {

        private final Menu menu;
        @Value("${coperto.costo}")
        private double costoCoperto;

        @Autowired
        public PizzeriaRunner(Menu menu) {
            this.menu = menu;
        }

        @Override
        public void run(String... args) throws Exception {

        }
    }
}
