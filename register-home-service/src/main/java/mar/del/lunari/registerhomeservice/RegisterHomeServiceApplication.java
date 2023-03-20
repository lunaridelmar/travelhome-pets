package mar.del.lunari.registerhomeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "mar.del.lunari")
public class RegisterHomeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterHomeServiceApplication.class, args);
	}

}
