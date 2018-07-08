package demo.test.junit;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class TestJUni5 {

	private String name = "TOSHIRO";
	private final static org.apache.log4j.Logger log = (org.apache.log4j.Logger) LoggerFactory.getLogger(TestJUni5.class);
	
	
	@Test
	void test() {
		System.out.println("INICIO BIEN ");
		log.info("PRUEBA DE LOG ");	
		
	}

}
