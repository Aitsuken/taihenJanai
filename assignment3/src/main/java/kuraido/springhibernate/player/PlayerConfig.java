package kuraido.springhibernate.player;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlayerConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            PlayerRepository playerRepository
    ){
        return args -> {

            Player Johann = new Player("Johann", 500);
            Player Marianna = new Player("Marianna", 229);

            playerRepository.saveAll(
                    List.of(Johann, Marianna)
            );
        };

    }
}
