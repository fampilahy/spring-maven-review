package xml.schema.based.aop;

public class UsuariosService {

	public String sacarUsuario() {
		System.out.println("here inside sacarUsuario");
		return "usuario1";
	}

	public void cambiarUsuario() {
		System.out.println("here inside cambiarUsuario");
	}

}
