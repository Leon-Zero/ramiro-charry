package portfolio.rcharry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication
public class RcharryApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(RcharryApplication.class, args);
	}

}
