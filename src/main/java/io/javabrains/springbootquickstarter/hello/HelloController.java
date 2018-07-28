package io.javabrains.springbootquickstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// spring -> para que sepa que esta clase es un servicio rest
@RestController
public class HelloController {

	// agrega la ruta /hello y ejectuta lo que tiene adentro de el metodo sayHi()
	@RequestMapping("/hello")
	public String sayHi() {
		return "podes buscar en el codigo donde diga esto de manera textual para saber donde se ejecutar";
	}
}
