/**
 * 
 */
package com.ciddev.springdesktop;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciddev.projectSpringDesktop.dao.DisqueraDAO;

/**
 * @author ciddev
 * Clase que permite realizar pruebas con el framework spring
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		
		assertNotNull(disqueraDAO);
		
		System.out.println("Contexto cargado exitosamente");
		System.out.println(disqueraDAO);
		
		//:::::PROPERTIES:::::
		Properties properties = (Properties) context.getBean("properties");
		System.out.println(properties.get("spring-username"));
	}

}
