package demo.test.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import demo.utility.Util;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("/aplicationContext.xml")
class TestJUni5 {	

	private Util util;
	@Test
	void testJWT() {
		System.out.println("INICIO DE PRUEBA ");
		util = new Util();
		
		String temporal = "";
		temporal = util.createToken("", "", "", null);
		
		System.out.println(temporal);	
		
	}


}
