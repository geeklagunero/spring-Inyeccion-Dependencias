package com.geeklagunero.springboot.id.app.models.service;

import org.springframework.stereotype.Component;

//component es un singleton
//la clase componente siempre debe de tener un constructor con parametro y uno vacio
@Component
public class MiServicio implements IMiServicio {

	@Override
	public String operacion() {
		return "Ejecutar algun proceso importante....";
	}

}
