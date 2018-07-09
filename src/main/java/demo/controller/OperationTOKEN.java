package demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operationTOKEN")
public class OperationTOKEN {
	
	@RequestMapping(value="/sumar/{numeroUno}/{numeroDos}",method=RequestMethod.GET)
	public String creatToken(@PathVariable("usuario")String usuario,@PathVariable("ip")String ip)
	{
		String token ="";				
		return token;
	}

}
