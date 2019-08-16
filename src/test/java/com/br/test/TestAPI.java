package com.br.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

/**
 * 
 * @author Robson Rodrigues da Silva
 * 		   Email: bobson278@gmail.com </br>
 * 		   GitHub: https://github.com/Bobson360</br>
 *
 */
public class TestAPI {
	
	public TestAPI() {
		baseURI = "https://jsonplaceholder.typicode.com/todos/1";
	}

	@Test
	public void teste() {
		
		/*Chama o serviço pelo metodo GET*/
	            given()
	           .contentType("application/json")
	           .when()
	    	   .get()
	    	   .then()
	    	   .statusCode(200)
	    	   .body("userId", equalTo(1))
	    	   .body("id", equalTo(1))
	    	   .body("title", containsString("delectus aut autem"))	 
	    	   .body("completed", equalTo(false));	 
		}

}
