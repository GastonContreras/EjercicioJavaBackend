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
		//si encapsulo la variable tasa en un objeto y lo retorno este se muestra como Json por defecto
		Response response = new Response();
		double tasa = servicio.tasaOperacion(object.getMarca(), object.getImporte());
		response.setTasa(tasa);
		return response;
	}
}
