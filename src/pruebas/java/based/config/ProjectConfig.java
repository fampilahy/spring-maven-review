package pruebas.java.based.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AdditionalConfig.class)
public class ProjectConfig {

	@Bean
	public Text getText() {
		return new Text();
	}

}
