package conf.basado.java.con.aspecto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfiguration {

	@Bean
	public CalculatorService getCalculatorService() {
		return new CalculatorService();
	}

	@Bean
	public AuditingService getAuditingService() {
		return new AuditingService();
	}

}
