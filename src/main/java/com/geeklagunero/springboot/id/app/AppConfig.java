package com.geeklagunero.springboot.id.app;


import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.context.annotation.Primary;*/

import com.geeklagunero.springboot.id.app.models.domain.ItemFactura;
import com.geeklagunero.springboot.id.app.models.domain.Producto;
//import com.geeklagunero.springboot.id.app.models.service.IMiServicio;
//import com.geeklagunero.springboot.id.app.models.service.MiServicio;
//import com.geeklagunero.springboot.id.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	/*
	 * @Bean public IMiServicio registrarServicio() { return new MiServicio(); }
	 * 
	 * @Primary
	 * 
	 * @Bean public IMiServicio registrarServicioComplejo() { return new
	 * MiServicioComplejo(); }
	 */
	
	@Bean("itemsFactura")
	public List<ItemFactura> registarItems(){
		Producto producto1 = new Producto("Camara Sony", 100);
		Producto productor2 = new Producto("Bicleta bianchi aro 25", 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(productor2, 4);
		
		return Arrays.asList(linea1, linea2);
	}
}
