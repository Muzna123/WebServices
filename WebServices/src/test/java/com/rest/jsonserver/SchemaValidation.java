package com.rest.jsonserver;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.when;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.lessThan;
import java.io.File;
import io.restassured.http.ContentType;

public class SchemaValidation {
	@Test
public void getAllResources() {
	when().get("http://localhost:3000/posts").then()
	.assertThat().contentType(ContentType.JSON).and()
	.statusCode(200).and()
	.body(matchesJsonSchema(new File(".\\src\\test\\resources\\Json\\getAllJsonSchema.json")));
}
}
