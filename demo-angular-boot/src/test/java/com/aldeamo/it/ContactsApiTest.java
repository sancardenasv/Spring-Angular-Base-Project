package com.aldeamo.it;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ContactsApiTest {

	@Test
	public void getAllContactsTest() {
		given()
			.when().get("/api/contactList")
			.then()
				.log().all()
				.statusCode(200)
				.body("name", hasSize(1))
				.body("name", hasItems("Santiago Cardenas"));
	}

}
