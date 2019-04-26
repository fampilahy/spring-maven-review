package aspectj.based.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aspectj.based.aop.business.PromocionesService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext a = new ClassPathXmlApplicationContext("aspectj/based/aop/con.xml");
		PromocionesService promocionesService = (PromocionesService) a.getBean("promocionesService");
		promocionesService.getPromo();

	}

}
