package demo.test.controller;

import org.springframework.web.client.RestTemplate;

import demo.modelo.Resultado;

public class TestControllerPadre {

	//private final static Logger log = LoggerFactory.getLogger(TestControllerPadre.class);

	public static void main(String[] args) {
		
		String url = "http://localhost:8080/demoJw/controller/operacionesMatematicas/sumar/{numeroUno}/{numeroDos}";
		
		RestTemplate restTemplate = new RestTemplate();
		
		try {
		Resultado res = restTemplate.getForObject(url, Resultado.class);
		System.out.println("FINALIZO EL LLAMADO DEL SERVICIO");
		//log.info("FINALIZO EL LLAMADO DEL SERVICIO");
		}
		catch(Exception e )
		{
			System.out.println(""+e.getMessage());
			//log.error("Error: "+e.getMessage());;
		}
		
	}

}
