package com.appestudante.junit.estudantesinfo;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.appestudante.model.EstudanteClass;
import com.appestudante.testbase.TestBase;
import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class EstudanteCRUDTest extends TestBase{

	static String firstName = "SMOKEUSER";
	static String lastName = "SMOKEUSER";
	static String programme = "ComputerScience";
	static String email = "sdf@gmail.com";
	
	@Title("Esse teste criara um novo estudante--POST")
	@Test
	public void createEstudante() {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("JAVA");
		courses.add("C++");
		
		EstudanteClass estudante = new EstudanteClass();
		estudante.setFirstName(firstName);
		estudante.setLastName(lastName);
		estudante.setEmail(email);
		estudante.setProgramme(programme);
		estudante.setCourses(courses);
		
		SerenityRest.given()
		.contentType(ContentType.JSON)
		.log()
		.all()
		.when()
		.body(estudante)
		.post()
		.then()
		.log()
		.all()
		.statusCode(201);
	}
}
