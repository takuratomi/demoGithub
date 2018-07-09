package demo.test.junit;

import java.util.logging.Logger;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import demoJunit5.Persona;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("/aplicationContext.xml")
class TestJUni5 {

	private String name = "TOSHIRO";
	private final static Logger log = Logger.getLogger("TestJUni5");

	@Test
	void test() {
		System.out.println("INICIO BIEN ");
		log.info("PRUEBA DE LOG ");

	}

	@Test
	void testJSON() {
		Persona p = new Persona("ALEJANDRO", 10);
		JSONObject jsonObject = new JSONObject(p);

		String temporal = jsonObject.toString();

		log.info("Salida de JSON");
		log.info(temporal);

	}
}
