package com.appestudante.junit.estudantesinfo;

import org.junit.runner.RunWith;
import org.junit.Test;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class primeiroTest {

	@Before
	public static void init() {
		RestAssured.baseURI="http://localhost:8080/student";
	}
	@Title("Este teste irá fazer um get em tudo")
	@Test
	public void getTodosEstudantes() {
		SerenityRest.given()
		.when()
		.get("http://localhost:8080/student/list")
		.then()
		.log()
		.all()
		.statusCode(200);
	}
	@Test
	public void thisIsaFailingTest() {
		SerenityRest.given()
		.when()
		.get("http://localhost:8080/student/list")
		.then()
		.statusCode(200);
	}
	
	@Pending
	@Test
	public void thisIsAPendingTest() {
		
	}
	
	@Pending
	@Test
	public void thisIsASkipTest() {
		
	}
}
