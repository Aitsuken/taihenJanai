package kuraido.springhibernate;

import kuraido.springhibernate.player.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class SpringhibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringhibernateApplication.class, args);
    }


}
