package conf.on.code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public SpellChecker getSpellChecker(){
		return new SpellChecker();
	}
	
	@Bean	
	public TextEditor getTextEditor(){
		return new TextEditor();
	}

}
