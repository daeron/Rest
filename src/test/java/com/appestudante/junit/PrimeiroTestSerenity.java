package com.appestudante.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class PrimeiroTestSerenity {

	@Before
	public static void init() {
		RestAssured.baseURI="http://localhost:8080/student";
	}
	@Test
	public void getTodosEstudantes() {
		RestAssured.given()
		.when()
		.get("http://localhost:8080/student/list")
		.then()
		.log()
		.all()
		.statusCode(200);
	}
}
