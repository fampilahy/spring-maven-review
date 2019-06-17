package xml.schema.based.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext app = new ClassPathXmlApplicationContext("xml/schema/based/aop/config.xml");

//		UsuariosService usuariosService = (UsuariosService) app.getBean("usuariosService");
//		usuariosService.cambiarUsuario();
//		usuariosService.sacarUsuario();
//		
		ContraseniasService contraseniasService = (ContraseniasService) app.getBean("contraseniasService");
		contraseniasService.cambiarContrasenia();
		contraseniasService.sacarContrasenia();

	}

}
