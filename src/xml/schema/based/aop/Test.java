package xml.schema.based.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xml.schema.based.aop.business.ContraseniasService;
import xml.schema.based.aop.business.UsuariosService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext app = new ClassPathXmlApplicationContext("xml/schema/based/aop/config.xml");
		// LoggingService loggingService = (LoggingService)
		// app.getBean("logging");

		CalculatorService calculatorService = (CalculatorService) app.getBean("calculatorService");
		System.out.println("Calcul :" + calculatorService.addition(1, 1));

		UsuariosService usuariosService = (UsuariosService) app.getBean("usuariosService");
		usuariosService.cambiarUsuario();
		usuariosService.sacarUsuario();
		
		ContraseniasService contraseniasService = (ContraseniasService) app.getBean("contraseniasService");
		contraseniasService.cambiarContrasenia();
		contraseniasService.sacarContrasenia();

	}

}
