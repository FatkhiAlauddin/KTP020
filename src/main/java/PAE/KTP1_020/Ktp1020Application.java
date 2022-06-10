package PAE.KTP1_020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Ktp1020Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Ktp1020Application.class, args);
	}
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Ktp1020Application.class);
    }

}
