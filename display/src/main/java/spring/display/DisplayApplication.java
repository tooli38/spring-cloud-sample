package spring.display;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("spring")
public class DisplayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisplayApplication.class, args);
    }

}
