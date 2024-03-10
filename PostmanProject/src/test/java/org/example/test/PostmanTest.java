package org.example.test;


import io.restassured.response.Response;
import org.example.api.Form;
import org.example.api.Specifications;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class PostmanTest {
    private static final String URL = "https://postman-echo.com/";
    @Test
    public void testCheckGET() {
        Specifications.installSpecification(Specifications.requestSpec(URL),Specifications.responseSpecOK200());
        Response response = given()
                .when()
                .get("get?foo1=bar1&foo2=bar2")
                .then().log().all()
                .extract().response();

        Assert.assertEquals(response.jsonPath().get("args.foo1"),"bar1");
        Assert.assertEquals(response.jsonPath().get("args.foo2"),"bar2");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-proto"),"https");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-port"),"443");
        Assert.assertEquals(response.jsonPath().get("headers.host"),"postman-echo.com");
        Assert.assertNotEquals(response.jsonPath().get("headers.x-amzn-trace-id"),"Root=1-65ec88a6-45ee002f0d57b87c690ac116");
        Assert.assertNotEquals(response.jsonPath().get("headers.user-agent"),"PostmanRuntime/7.36.3");
        Assert.assertEquals(response.jsonPath().get("headers.accept"),"*/*");
        Assert.assertNotEquals(response.jsonPath().get("headers.cache-control"),"no-cache");
        Assert.assertNotEquals(response.jsonPath().get("headers.postman-token"),"ecfb332d-d0c8-4d1e-9526-399b7e1cb10a");
        Assert.assertNotEquals(response.jsonPath().get("headers.accept-encoding"),"gzip, deflate, br");
        Assert.assertNotEquals(response.jsonPath().get("headers.cookie"),"sails.sid=s%3AyM5jY3NPq_dvUhAeCrWq-ywV_uCtKNAC.mzd1fwvELLLi%2F1Nvff2lmFCwxp4D9fYbSN5ox5oYpEs");
        Assert.assertEquals(response.jsonPath().get("url"),"https://postman-echo.com/get?foo1=bar1&foo2=bar2");
    }

    @Test
    public void testCheckPOSTRawText() {
        Specifications.installSpecification(Specifications.requestSpec(URL),Specifications.responseSpecOK200());
        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = given()
                .when()
                .body(requestBody)
                .post("post")
                .then().log().all()
                .extract().response();
        Assert.assertNotEquals(response.jsonPath().get("args")," ");
        Assert.assertEquals(response.jsonPath().get("data"),"This is expected to be sent back as part of response body.");
        Assert.assertNotEquals(response.jsonPath().get("files"),"");
        Assert.assertNotEquals(response.jsonPath().get("form"),"");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-proto"),"https");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-port"),"443");
        Assert.assertEquals(response.jsonPath().get("headers.host"),"postman-echo.com");
        Assert.assertNotEquals(response.jsonPath().get("headers.x-amzn-trace-id"),"Root=1-65ed620b-799056be1cfbe74c7f21a850");
        Assert.assertEquals(response.jsonPath().get("headers.content-length"),"58");
        Assert.assertNotEquals(response.jsonPath().get("headers.content-type"),"text/plain");
        Assert.assertNotEquals(response.jsonPath().get("headers.user-agent"),"PostmanRuntime/7.36.3");
        Assert.assertEquals(response.jsonPath().get("headers.accept"),"*/*");
        Assert.assertNotEquals(response.jsonPath().get("headers.cache-control"),"no-cache");
        Assert.assertNotEquals(response.jsonPath().get("headers.postman-token"),"ecfb332d-d0c8-4d1e-9526-399b7e1cb10a");
        Assert.assertNotEquals(response.jsonPath().get("headers.accept-encoding"),"gzip, deflate, br");
        Assert.assertNotEquals(response.jsonPath().get("headers.cookie"),"sails.sid=s%3ASvzyzx3mrvb1W5UTtLF6rybwYzE6SfWE.GkPWIdahn5fycAInAlHojrFySTUpAaOr%2FKlTEifllf0");
        Assert.assertNotEquals(response.jsonPath().get("json"),"");
        Assert.assertEquals(response.jsonPath().get("url"),"https://postman-echo.com/post");
    }
    @Test
    public void testCheckPOSTFormData() {
        Specifications.installSpecification(Specifications.requestSpec(URL),Specifications.responseSpecOK200());
        Form form = new Form("bar1", "bar2");
        Response response = given()
                .when()
                .body(form)
                .post("post")
                .then().log().all()
                .extract().response();
        Assert.assertNotEquals(response.jsonPath().get("args"),"");
        Assert.assertNotEquals(response.jsonPath().get("data"),"");
        Assert.assertNotEquals(response.jsonPath().get("files"),"");
        Assert.assertNotEquals(response.jsonPath().get("form.foo1"),"bar1");
        Assert.assertNotEquals(response.jsonPath().get("form.foo2"),"bar2");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-proto"),"https");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-port"),"443");
        Assert.assertEquals(response.jsonPath().get("headers.host"),"postman-echo.com");
        Assert.assertNotEquals(response.jsonPath().get("headers.x-amzn-trace-id"),"Root=1-65ed620b-799056be1cfbe74c7f21a850");
        Assert.assertNotEquals(response.jsonPath().get("headers.content-length"),"19");
        Assert.assertNotEquals(response.jsonPath().get("headers.user-agent"),"PostmanRuntime/7.36.3");
        Assert.assertEquals(response.jsonPath().get("headers.accept"),"*/*");
        Assert.assertNotEquals(response.jsonPath().get("headers.cache-control"),"no-cache");
        Assert.assertNotEquals(response.jsonPath().get("headers.postman-token"),"ecfb332d-d0c8-4d1e-9526-399b7e1cb10a");
        Assert.assertNotEquals(response.jsonPath().get("headers.accept-encoding"),"gzip, deflate, br");
        Assert.assertNotEquals(response.jsonPath().get("headers.cookie"),"sails.sid=s%3ASvzyzx3mrvb1W5UTtLF6rybwYzE6SfWE.GkPWIdahn5fycAInAlHojrFySTUpAaOr%2FKlTEifllf0");
        Assert.assertNotEquals(response.jsonPath().get("headers.content-type"),"application/x-www-form-urlencoded");
        Assert.assertEquals(response.jsonPath().get("json.foo1"),"bar1");
        Assert.assertEquals(response.jsonPath().get("json.foo2"),"bar2");
        Assert.assertEquals(response.jsonPath().get("url"),"https://postman-echo.com/post");
    }
    @Test
    public void testCheckPUT() {
        Specifications.installSpecification(Specifications.requestSpec(URL),Specifications.responseSpecOK200());
        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = given()
                .when()
                .body(requestBody)
                .put("put")
                .then().log().all()
                .extract().response();
        Assert.assertNotEquals(response.jsonPath().get("args"),"");
        Assert.assertEquals(response.jsonPath().get("data"),"This is expected to be sent back as part of response body.");
        Assert.assertNotEquals(response.jsonPath().get("files"),"");
        Assert.assertNotEquals(response.jsonPath().get("form"),"");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-proto"),"https");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-port"),"443");
        Assert.assertEquals(response.jsonPath().get("headers.host"),"postman-echo.com");
        Assert.assertNotEquals(response.jsonPath().get("headers.x-amzn-trace-id"),"Root=1-65ed620b-799056be1cfbe74c7f21a850");
        Assert.assertEquals(response.jsonPath().get("headers.content-length"),"58");
        Assert.assertNotEquals(response.jsonPath().get("headers.content-type"),"text/plain");
        Assert.assertNotEquals(response.jsonPath().get("headers.user-agent"),"PostmanRuntime/7.36.3");
        Assert.assertEquals(response.jsonPath().get("headers.accept"),"*/*");
        Assert.assertNotEquals(response.jsonPath().get("headers.cache-control"),"no-cache");
        Assert.assertNotEquals(response.jsonPath().get("headers.postman-token"),"4bd93470-d94e-433a-9f3f-f121b9a95bef");
        Assert.assertNotEquals(response.jsonPath().get("headers.accept-encoding"),"gzip, deflate, br");
        Assert.assertNotEquals(response.jsonPath().get("headers.cookie"),"sails.sid=s%3ASvzyzx3mrvb1W5UTtLF6rybwYzE6SfWE.GkPWIdahn5fycAInAlHojrFySTUpAaOr%2FKlTEifllf0");
        Assert.assertNotEquals(response.jsonPath().get("json"),"");
        Assert.assertEquals(response.jsonPath().get("url"),"https://postman-echo.com/put");
    }
    @Test
    public void testCheckPATCH() {
        Specifications.installSpecification(Specifications.requestSpec(URL),Specifications.responseSpecOK200());
        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = given()
                .when()
                .body(requestBody)
                .patch("patch")
                .then().log().all()
                .extract().response();
        Assert.assertNotEquals(response.jsonPath().get("args"),"");
        Assert.assertEquals(response.jsonPath().get("data"),"This is expected to be sent back as part of response body.");
        Assert.assertNotEquals(response.jsonPath().get("files"),"");
        Assert.assertNotEquals(response.jsonPath().get("form"),"");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-proto"),"https");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-port"),"443");
        Assert.assertEquals(response.jsonPath().get("headers.host"),"postman-echo.com");
        Assert.assertNotEquals(response.jsonPath().get("headers.x-amzn-trace-id"),"Root=1-65ed620b-799056be1cfbe74c7f21a850");
        Assert.assertEquals(response.jsonPath().get("headers.content-length"),"58");
        Assert.assertNotEquals(response.jsonPath().get("headers.content-type"),"text/plain");
        Assert.assertNotEquals(response.jsonPath().get("headers.user-agent"),"PostmanRuntime/7.36.3");
        Assert.assertEquals(response.jsonPath().get("headers.accept"),"*/*");
        Assert.assertNotEquals(response.jsonPath().get("headers.cache-control"),"no-cache");
        Assert.assertNotEquals(response.jsonPath().get("headers.postman-token"),"4bd93470-d94e-433a-9f3f-f121b9a95bef");
        Assert.assertNotEquals(response.jsonPath().get("headers.accept-encoding"),"gzip, deflate, br");
        Assert.assertNotEquals(response.jsonPath().get("headers.cookie"),"sails.sid=s%3ASvzyzx3mrvb1W5UTtLF6rybwYzE6SfWE.GkPWIdahn5fycAInAlHojrFySTUpAaOr%2FKlTEifllf0");
        Assert.assertNotEquals(response.jsonPath().get("json"),"");
        Assert.assertEquals(response.jsonPath().get("url"),"https://postman-echo.com/patch");
    }
    @Test
    public void testCheckDELETE() {
        Specifications.installSpecification(Specifications.requestSpec(URL),Specifications.responseSpecOK200());
        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = given()
                .when()
                .body(requestBody)
                .delete("delete")
                .then().log().all()
                .extract().response();
        Assert.assertNotEquals(response.jsonPath().get("args"),"");
        Assert.assertEquals(response.jsonPath().get("data"),"This is expected to be sent back as part of response body.");
        Assert.assertNotEquals(response.jsonPath().get("files"),"");
        Assert.assertNotEquals(response.jsonPath().get("form"),"");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-proto"),"https");
        Assert.assertEquals(response.jsonPath().get("headers.x-forwarded-port"),"443");
        Assert.assertEquals(response.jsonPath().get("headers.host"),"postman-echo.com");
        Assert.assertNotEquals(response.jsonPath().get("headers.x-amzn-trace-id"),"Root=1-65ed620b-799056be1cfbe74c7f21a850");
        Assert.assertEquals(response.jsonPath().get("headers.content-length"),"58");
        Assert.assertNotEquals(response.jsonPath().get("headers.content-type"),"text/plain");
        Assert.assertNotEquals(response.jsonPath().get("headers.user-agent"),"PostmanRuntime/7.36.3");
        Assert.assertEquals(response.jsonPath().get("headers.accept"),"*/*");
        Assert.assertNotEquals(response.jsonPath().get("headers.cache-control"),"no-cache");
        Assert.assertNotEquals(response.jsonPath().get("headers.postman-token"),"4bd93470-d94e-433a-9f3f-f121b9a95bef");
        Assert.assertNotEquals(response.jsonPath().get("headers.accept-encoding"),"gzip, deflate, br");
        Assert.assertNotEquals(response.jsonPath().get("headers.cookie"),"sails.sid=s%3ASvzyzx3mrvb1W5UTtLF6rybwYzE6SfWE.GkPWIdahn5fycAInAlHojrFySTUpAaOr%2FKlTEifllf0");
        Assert.assertNotEquals(response.jsonPath().get("json"),"");
        Assert.assertEquals(response.jsonPath().get("url"),"https://postman-echo.com/delete");
    }
}
