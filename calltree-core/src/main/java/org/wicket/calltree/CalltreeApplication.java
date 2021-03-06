package org.wicket.calltree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.wicket.calltree")
public class CalltreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalltreeApplication.class, args);
    }

}
