package cl.prueba.pruebajava.util;


import cl.prueba.pruebajava.mysql.entity.Usuarios;

import java.util.List;

public class ResponseMessageGenerico {

	   private int code;
	   private String message;
	   private List<Usuarios> usuarios;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Usuarios> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuarios> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "ResponseMessageGenerico{" +
				"code=" + code +
				", message='" + message + '\'' +
				", usuarios=" + usuarios +
				'}';
	}
}
