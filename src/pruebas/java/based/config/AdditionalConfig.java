package pruebas.java.based.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdditionalConfig {

	@Bean Screen getScreen(){
		return new Screen();
	}

}
