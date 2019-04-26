package aspectj.based.aop.logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggerService {

	@Pointcut("execution(* aspectj.based.aop.business.*.*(..))")
	private void selectAll() {

	}

	@After("selectAll()")
	public void afterCallsLogger() {
		System.err.println("here inside after calls method");
	}

	public LoggerService() {

	}

}
