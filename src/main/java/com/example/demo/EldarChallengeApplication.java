package com.example.demo;

import Entidades.Pedido;
import Entidades.Response;
import Servicios.TarjetaServicio;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class EldarChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EldarChallengeApplication.class, args);
	}

	@PostMapping("/calcularTasa")
	public Response postBody(@RequestBody String fullName) {
		Gson gson = new Gson();
		Pedido object = gson.fromJson(fullName, Pedido.class);
		System.out.println(object);
		TarjetaServicio servicio = new TarjetaServicio();
		double tasa = servicio.tasaOperacion(object.getMarca(), object.getImporte());
		Response response = new Response();
		if(tasa != 0 && object.getImporte() != 0){
			response.setTasa(tasa);
			response.setMensaje("Todo salio bien.");
		}  else {
			response.setTasa(0);
			response.setMensaje("Error, la marca o el importe son invalidos.");
		}
		//si retorno el objeto response este se muestra en formator Json por defecto
		return response;
	}
}
