package conf.basado.java.con.aspecto;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AuditingService {

	@Before("selectAll()")
	public void beforeAdvice() {
		System.err.println("here inside before");
	}

	@Pointcut("execution(* conf.basado.java.con.aspecto.CalculatorService.*(..))")
	public void selectAll() {

	}

	public AuditingService() {

	}

}
